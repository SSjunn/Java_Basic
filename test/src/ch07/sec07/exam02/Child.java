package ch07.sec07.exam02;

public class Child extends Parent {
	// 메소드 오버라이딩
	@Override // 재정의한 메서드
	public void method2() {
		System.out.println("Child-method2()");
	}
	// 추가한 메서드
	public void method3() {
		System.out.println("Child-method3()");
	}

}
