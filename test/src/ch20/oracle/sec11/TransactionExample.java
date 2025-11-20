package ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionExample {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 커넥션객체 생성
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe", "testuser", "test1234");
			System.out.println("연결 성공");
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);
			
			// 출금
			String sql = "UPDATE accounts SET balance=balance-?  WHERE ano=?";
			pstmt = conn.prepareStatement(sql); // 미리 준비
			// ? 자리에 값을 대입
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "111-111-1111");
			int rows1 = pstmt.executeUpdate(); // 실행(수정된 개수 리턴)
			if (rows1 == 0) throw new Exception("출금되지 않음");
			
			// 입금
			String sql2 = "UPDATE accounts SET balance=balance+?  WHERE ano=?";
			pstmt2 = conn.prepareStatement(sql2); // 미리 준비
			// ? 자리에 값을 대입
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-2223");
			int rows2 = pstmt2.executeUpdate(); // 실행(수정된 개수 리턴)
			if (rows2 == 0) throw new Exception("입금되지 않음");
			
			// 커밋
			conn.commit();
			System.out.println("계좌 이체 성공");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try { conn.rollback(); } catch (Exception e2) {}
			System.out.println("계좌 이체 실패");
		} finally {
			try {conn.setAutoCommit(true);} catch (Exception e) {}
			try {rs.close();}catch(Exception e) {}
			try {pstmt.close();}catch(Exception e) {}
			try {pstmt2.close();}catch(Exception e) {}
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (Exception e) {}
			}
		}
	}

}