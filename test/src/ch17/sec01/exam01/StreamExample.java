package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		//Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김바덕");
		set.add("광길동");
		
		Stream<String> stream = set.stream();
		
		// 람다 표현식
		stream.forEach(name -> System.out.println(name));
		
		// 익명구현개게
//		stream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		// 구현 클래스
//		UserClass uc = new UserClass();
//		stream.forEach(uc);
		
		// 확인(출력)
		set.stream().forEach(n->System.out.println(n));

	}

}
