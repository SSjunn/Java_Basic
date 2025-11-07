package ch18.sec04.exam01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            reader = new FileReader("E:/Temp/test.txt");

            // 첫 번째 방법: 한 문자씩 읽기
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }

            reader.close();

            System.out.println();

            // 두 번째 방법: char 배열로 읽기
            reader = new FileReader("E:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }

            reader.close(); // while 밖으로 빼야 함

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
