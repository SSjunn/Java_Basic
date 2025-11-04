package ch12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean result = Pattern.matches("b[a-z]*", "bat");
//		System.out.println(result);
		
		Pattern p = Pattern.compile("b[a-z]*");
		
		Matcher m = p.matcher("bat");
		System.out.println(m.matches());
		System.out.println(p.matcher("cat").matches());
		
		// 전화번호 추출
		String source = "안녕하셍 저는 홍길동인데요, 제 전화번호는 010-1234-5678입니다. 계좌번호는 123-5678-9012, 그런데요 제 친구번호는 02-4777-3899";
		p = Pattern.compile("0\\d{1,2}-\\d{3,4}-\\d{4}");
		
		m = p.matcher(source);
//		System.out.println(m.matches()); // 이게 false 가 나오는데 그 이유는 모르겠음
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
