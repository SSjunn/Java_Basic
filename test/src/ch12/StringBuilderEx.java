package ch12;

import java.awt.List;
import java.util.ArrayList;

public class StringBuilderEx {

	public static void main(String[] args) {
		// String : immutable (변형이 가능하지 않은)
		// 홍길동이 있는곳이랑 홍길동님이 있는 곳의 위치가 다른다.
//		String name = "홍길동";
//		System.out.println(name.hashCode());
//		name +="님";
//		System.out.println(name.hashCode());
//		System.out.println(name);
//		
//
//
//		
//		// 이건 같은 곳에 저장이 되어 있어 append 는 문자열 끝에 추가를 하는거기 때문에 주소가 바뀌지 않아.
//		StringBuilder sb = new StringBuilder();
//		sb.append("홍길동");
//		System.out.println(sb.hashCode());
//		sb.append("님");
//		System.out.println(sb.hashCode());
//		System.out.println(sb.toString());
		
		
		// 데이터가 많으면 String 을 쓰는게 아니다.
//		long start = System.currentTimeMillis();
//		String str  = "";
//		for (int i = 0; i<1000000; i++) {
//			str += i;
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("소요시간"+ (end - start));
		
		
		// 위에 String 으로 하면 5분 이상이 걸리는데 StringBuilder를 사용하는것 이 정말 빠르다. 0.018초가 나온다.
		long start = System.currentTimeMillis();
		StringBuilder sb  = new StringBuilder();
		for (int i = 0; i<1000000; i++) {
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간"+ ((double)(end - start)/1000) +"초");
		
		
		
		int a = 01;
		ArrayList list = new ArrayList();
		list.add(a); // int -> (박싱) Integer 객체 -> Object 자동형변환
		
		Integer b = a;  // boxing
		int c = b; //unboxing
		
		
		/* wrapper class */
		Long d = 30L;
		int e  = d.intValue();
		
		
		
		// 소수점 두자리에서 반올림
		
		
		// 소수점 세자리로 반올림
		// 세자리(3) -> 10의 3승
		double f = 1.1235;
		double f2 = f * 1000;
		System.out.println(Math.round(f2) / (double)1000);
		
		
		
		
	}

}
