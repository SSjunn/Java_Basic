package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writeExample {
	public static void main(String[] args) {
		try {
			// 문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("E:/Temp/test.txt");
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			
			// char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			writer.write(65); // 이건 아스키 코드를 받아서 A로 출력이 나온다.
			
			writer.flush();
			
			writer.close();
			}catch (IOException e) {
				e.printStackTrace();
			
		}
	}

}
