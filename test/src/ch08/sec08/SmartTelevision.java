package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
	
	
	// 추상 메소드 오버라이팅
	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다.");

	}
	
	// 추상 메소드 오버라이팅
	@Override
	public void turnOff() {
		System.out.println("TV 를 끕니다..");

	}
	
	// 추상 메소드 오버라이팅
	@Override
	public void search(String url) {
		System.out.println("을 겁색합니다.");

	}

}
