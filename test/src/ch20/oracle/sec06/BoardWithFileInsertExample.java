package ch20.oracle.sec06;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			// 2. 커넥션객체 생성
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"testuser",
					"test1234"
					);
			
			System.out.println("연결 성공");

			// PreparedStatement
			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ";
			sql += "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			
			pstmt = conn.prepareStatement(sql, new String[] {"bno"}); // 미리 준비 이 준비는 무조건 필요하다. 키가 하나만 있으라는 보장이 없기 때문에 배열을 넣어준거다. 배열을 안쓰면 가변 문자열을 써줘야 한다.
			// ? 자리에 값을 대입
			pstmt.setString(1, "눈 오는 날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "E:/Temp/target.jpg");
//			pstmt.setBlob(5,  BoardWithFileInsertExample.class.getResourceAsStream("E:/Temp/target.jpg"));
			FileInputStream fis = new FileInputStream("E:/Temp/target.jpg"); // FileInputStream 을 넣어줘야 경로를 읽고서 파일을 찾을 수 있다.
			pstmt.setBlob(5, fis);
			// int result = pstmt.executeUpdate(); // 실행(등록한 개수 리턴)
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			if (rows == 1) {
				 rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {rs.close();}catch(Exception e) {}
			try {pstmt.close();}catch(Exception e) {}
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}

}