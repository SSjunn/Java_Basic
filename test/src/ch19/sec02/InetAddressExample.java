package ch19.sec02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;


public class InetAddressExample {

	public static void main(String[] args) throws Exception {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소: "+ local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소 : " + remote.getHostAddress());
			}
			
			String url = "https://www.egovframe.go.kr/home/sub.do?menuNo=10";
			URL urlobj = new URL(url);
			System.out.println(urlobj.getProtocol());
			System.out.println(urlobj.getQuery());
			InputStream is = urlobj.openStream();
//			Reader reader = new InputStreamReader(is); // 보조스트림(바이트 -> 텍스트기반)
//			int count = 0;
//			while ((count = reader.read())!=-1) {
//				System.out.println((char)count);
//			}
			// 보조스트림(성능향상)
			// 바이트기반스트림 -> 텍스트기반으로 변경하는 보조스트림 -> 성능향상보조스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(urlobj.openStream()));
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		

	}

}
