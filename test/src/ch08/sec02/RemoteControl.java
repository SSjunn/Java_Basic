package ch08.sec02;

public interface RemoteControl {
	// public 추상 메소드
	// public abstract 가 생략이 되어 있다.
	// 인터페이스에서는 무조건 abstract 이다.
	void turnOn();
	
	// 상수
	// public static final
	// interface 는 무조건 public static final 상수이다.
	double PI = 3.14;
	
	// default 메서드 -> 일반 메서드
	// 일반 메서드라고 표현을 하기 위해서 default 라는 키워드를 꼭 써줘야 한다.
	// public 
	default int add(int x, int y) {
		test2();
		return x +y;
	}
	
	// static 메서드 (인터페이스명으로 직접 접근해서 사용)
	// public static
	static void test() {
		test3();
		
	}
	// private (인터페이스 내부에서만 사용가능)
	private void test2() {
		
	}
	private static void test3() {
		
	}

}
