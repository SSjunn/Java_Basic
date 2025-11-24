package ch07.sec10.exam01;


public class SmartPhone extends Phone {
	
	// 생성자 선언
	SmartPhone(String owner){
		//Phone 생성자 호출
		super(owner);
	}
	
	void interetSearch() {
		System.out.println("인터넷 감사를 합니다.");
	}
	@Override
	void turnOn() {
		System.out.println("자식의 재정의");
	}
	void call() {
		System.out.println("스마트폰에서 전화걸기");
	}

}
