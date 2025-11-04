package ch07.sec02;

public class SmartPhone extends Phone {
	// 필드 선언
	public boolean wifi;
	
	//생성자 선언
	public SmartPhone(String model, String color) {
//		super(); // 부모의 생성자 실행
		super("모델명"); // Phone class 에서 public phone에 Stirng model로 받고 있어서 값을 정의 $해줘야한다. 부모니까!!
		System.out.println("자식생성자");
		this.model = model;
		this.color = color;
	}
	
	
	
	//오버 로딩
//	public void bell(String msg) {
//		System.out.println("새로운 벨소리");
//	}
	
	@Override
	public void bell() {
		System.out.println("새로운 벨소리");
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
}
