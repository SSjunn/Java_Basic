package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = null;
		try {
			 is = new FileInputStream("E://Temp/test1.db");
			
//			while(true) {
//				int data  = is.read();  // 1바이트 씩 읽어
//				if (data == -1) break;  // -1 이면 없다는거야
//				System.out.println(data);  // 출력해!!
//			}
//			 int data =0;
//			 while ((data = is.read()) != -1) {
//				 System.out.println(data);
//			 }
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//			}finally {
//				try {is.close();}catch(Exception e) {}
//			}
//		
//		}catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
		// 배열로 바꾸기
		byte[] data = new byte[100];
		
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			
			for(int i =0; i<num; i++) {
				System.out.println(data[i]);
			}
		}
		is.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
