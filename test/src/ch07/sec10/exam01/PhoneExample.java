package ch07.sec10.exam01;



public class PhoneExample {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.interetSearch();
		smartPhone.turnOff();
		
		Phone p = new PublicPhone("김길동"); // 공중전화 객체
		p = smartPhone; // 스마트폰 객체
		p.call(); // 실행 코드 -> 다형성이 된다.
		/*
		 * 이거 부모에 call 이라는게 존재 해서 사용이 가능한거야.
		 * 동일 메서드에서 사용이 가능하려면 형 변환이 되어야 하고 부모 참조관계가 되어야 하고
		 * 이게 재정의가 되어야 가능하다.
		 */

	}

}
