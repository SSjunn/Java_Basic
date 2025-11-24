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
	
	// int x 가 빠지면 위에 같은 메서드를 가지고 있어서 error 가 나는데 int x 가 붙으면서 다른거로 바뀐거다.
	Member(int x){
		
	}
	// int y 만 넣으면 error 가 나는데 이유는 앞에 정수 int 를 기준으로 체크를 한다. type 의 순서 추가 이런거에 따라 error 가 나지 않는다. (이게 오버로딩(overloading))
	Member(int y, String z){
		
	}

	// 메서드
	int add(int x, int y) {
		System.out.println(age);
		test();
		return x + y;
	}



}
