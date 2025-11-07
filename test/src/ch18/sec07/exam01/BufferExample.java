package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        // 입출력 스트림 생성
        String originalFilePath1 = "E:/Temp/target.jpg";
        String targetFilePath1 = "E:/Temp/target2.jpg";
                
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        // 버퍼 스트림 생성
        String originalFilePath2 = "E:/Temp/target.jpg";
        String targetFilePath2 = "E:/Temp/target3.jpg";
                
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);
        
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용: \t" + nonBufferTime + "ns");
        
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용: \t" + bufferTime + "ns");
        
        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        
        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        
        long end = System.nanoTime();
        
        return (end - start);
    }
}
