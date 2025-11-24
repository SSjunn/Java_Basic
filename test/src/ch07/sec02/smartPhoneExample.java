package ch07.sec02;

public class smartPhoneExample {

	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myPhone  = new SmartPhone("갤럭시", "은색");
		
		// Phone으로부터 상속을 받은 필드 읽기
		System.out.println("모델 "+myPhone.model);
		System.out.println("색상 "+myPhone.color);
		
		// SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		// Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoid("안녕세요! 홍길동입니다");
		myPhone.sendVoice("아~네 반갑습니다.");
		myPhone.hangUp();
		
		// SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
		Phone p = myPhone; // 자동형변환
		SmartPhone s = (SmartPhone)p; // 강제 형변환 (조건: 반드시 p 값은 원래 자식이었다가 부모로 형 변환된 객체만 가능) 
		//SmartPhone s = p; // 더 넓은 범위는 더 작은 범위를 담을 수 없다.
		
		Phone p2 = new Phone("");
		SmartPhone s2 = (SmartPhone)p2; // 실행을 하면 에러가 난다.(런타임 에러) 다운캐스팅을 해서 문제가 발생한다.

	}

}
