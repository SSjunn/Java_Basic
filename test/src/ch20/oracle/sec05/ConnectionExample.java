package ch20.oracle.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; // 항상 위에 적어줘야 한다.
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver"); // 초기화 한거다

			// 2. 커넥션객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "testuser", "test1234");
			System.out.println("연결 성공");
			
			
			String userid = "winter3";
			String username = "한겨울";
			String userpassword = "12345";
			int userage = 25;
			String useremail = "winter@mycompany.com";
			
			
			// 3. Statement or PreparedStatement 객체 생성
			
//			// Statement : 그냥 있는 그대로 실행하는 것
//			Statement stmt = conn.createStatement();
//			String sql = "INSERT INTO users (userid, username, userpassword, userage, useremail)";
//			sql += " VALUES ('"+userid+"','"+username+"','"+userpassword+"','"+userage+"','"+useremail+"')";
//			int result = stmt.executeUpdate(sql); // 등록한 개수 리턴
//			if(result > 0) {
//				System.out.println("등록 성공");
//			}else {
//				System.out.println("등록 실패");
//			}
			
			
			// PreparedStatement : 먼저 준비를 시키고 나중에 실행을 한다.
			String sql = "INSERT INTO users (userid, username, userpassword, userage, useremail)";
			sql += " VALUES (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql); // prepareStatement에 넣어서 미리 준비(실행이 아니야)
			// ? 자리에 값을 대입한다.
			pstmt.setString(1,userid);
			pstmt.setString(2, username);
			pstmt.setString(3, userpassword);
			pstmt.setInt(4, userage);
			pstmt.setString(5, useremail);
			
			// 4. SQL 실행
			int result = pstmt.executeUpdate(); // 실행(등록한 개수 리턴)
			System.out.println("result: "+result);
			
//			pstmt.close() 여기다가 작성을 하게 되면 중간에 에러가 날때 실행이 안된다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5. 자원해제
			try {pstmt.close();}catch(Exception e) {} // 여기에 넣어줘야 close 가능하다.
			if (conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {
				}
			}
		}
	}

}
