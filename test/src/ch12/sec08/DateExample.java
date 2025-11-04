package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		// yyyy.MM.dd HH:mm:ss 규칙을 잘 지켜주면 된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 aHH시mm분ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
