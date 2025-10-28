package ch06;

public class Member {
	// JAVA는 코딩에 순서가 없다
	// 밑에 처럼 순서가 없다 하지만 암묵적인 룰이 있다.
	// 순서는 필드 -> 생성자 -> 메서드 순서로 코드를 작성을 해야 한다. 
	
	// 필드
	int age;
	
	// 메서드
	void test() {
		
	}
	

	// 생성자
	Member() {

	}

	// 메서드
	int add(int x, int y) {
		System.out.println(age);
		test();
		return x + y;
	}



}
