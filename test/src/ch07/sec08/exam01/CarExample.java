package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// Tire 객체 생성
		myCar.tire = new Tire(); // Tire 객체를 주입(inject)
		myCar.run();
		
		// HankookTire 객체 생성
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 생성
		myCar.tire = new KumhoTire();
		myCar.run();
		
		Tire[] tire = {new Tire(), new HankookTire(), new KumhoTire()};
		for (Tire t : tire) {
			myCar.tire = t;
			myCar.run();
		}
			
		}

}
