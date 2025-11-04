package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		// 매개값으로 Bus 객체를 제공하고 driver()메소드 호출
		// 형 변환이 일어난거다.
		Bus bus = new Bus();
		//Vehicle bus = new Bus(); 이렇게 해도 가능해.
		driver.drive(bus); 
		
		// 매개값으로 Bus 객체를 제공하고 driver()메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}
	
	public void method(Vehicle parent) {
		if(parent instanceof Bus) {
			Bus child  = (Bus)parent;
		}
	}

}
