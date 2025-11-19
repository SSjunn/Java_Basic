package ch20.oracle.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardSelectExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"testuser",
					"test1234"
					);
			String sql = ""
			        + "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata "
			        + "FROM boards "
			        + "WHERE bwriter = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			
			ResultSet rs = pstmt.executeQuery();
			List<Board> list = new ArrayList();
			while(rs.next()) {
				Board b = new Board();
				b.setBno(rs.getInt("bno"));
				b.setBtitle(rs.getString("btitle"));
				b.setBcontent(rs.getString("bcontent"));
				b.setBdate(rs.getDate("bdate"));
				b.setBfilename(rs.getString("bfilename"));
				b.setBfiledata(rs.getBlob("bfiledata"));
				list.add(b);
				
				System.out.println(b);
				
				Blob blob = b.getBfiledata();
				if(blob  != null){
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("E:/Temp/" + b.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
				
			}
			rs.close();
			pstmt.close();
			System.out.println(list);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch (SQLException e) {}
			}
		}
		}

}
