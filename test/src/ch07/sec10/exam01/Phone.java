package ch07.sec10.exam01;

public abstract class Phone {
	
	// 필드 선언
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	// 전화걸기 (추상 메서드 -> 메서드 재정의 강제)
	// 추상 메서드가 있어서 위에 public abstract class 라고 추상클래스를 만들어 둔거다!
	abstract void call();
	
//	void call() {
//		
//	
//	}
	
	// 메서드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}


}
