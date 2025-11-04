package ch06.sec06.exam01;

public class Car {
	// 필드 선언
	String company="현대 자동차";
	String model;
	boolean start;
	int speed;

	// 생성자가 없으면 기본 생성자(매개변수가 없는)가 자동으로 생성
	// 아무것도없어야 기본 생성자가 자동으로 만들어진다.
//	Car(int fuel) {
//		
//	}

	Car(int fuel) {

	}

	Car() {
		// 초기화
		model ="소나타";
		start = (true);
	}
}
