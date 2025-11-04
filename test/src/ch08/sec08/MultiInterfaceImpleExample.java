package ch08.sec08;

public class MultiInterfaceImpleExample {
	public static void main(String[] args) {
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc  = new SmartTelevision();
		
		//RemoteControl 인터페이스 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable serSearchable = new SmartTelevision();
		//Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		serSearchable.search("https://www.youtube.com");
		// serSearchable.turnOn();
		
		
		// 타입 때문에 위에는 사용을 못했던건데 형 변환을 해서 사용이 가능하다.
		SmartTelevision searchable2 = (SmartTelevision)serSearchable;
		searchable2.turnOn();
	}

}
