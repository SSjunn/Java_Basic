package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDeletExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"testuser",
					"test1234"
					);
			
			System.out.println("연결 성공");

			// PreparedStatement
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			
			pstmt = conn.prepareStatement(sql); //
			//이 bno의 값들을 다시 받아온다  // 이건 왜 배열로 써야댐 ? bno값들이 필요해서 받아옴 
			
			// ? 자리에 값을 대입
			pstmt.setString(1, "winter");
			
			int result = pstmt.executeUpdate(); //실행 수정된 갯수 리턴 
			System.out.println("result: "+result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
				
			try {pstmt.close();}catch(Exception e) {}
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (Exception e) {}
			}
		}
	}

}










