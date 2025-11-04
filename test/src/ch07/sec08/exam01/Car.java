package ch07.sec08.exam01;

public class Car {
	//필드 선언
	public Tire tire; //모든 Tire 의 자식이라면 전부 다 담을 수 있다.
	
	// 메서드 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}

}
