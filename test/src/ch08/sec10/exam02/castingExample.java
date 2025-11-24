package ch08.sec10.exam02;

public class castingExample {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		// vehicle.checkFare(); 형변환 된게 없기 때문에 이건 X
		
		
		// 강제 타입 변한 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
		
//		// 타입 추론
//		// 이건 가능한 사용을 하지 않는게 좋다.
//		var v = new Bus();
//		System.out.println(v instanceof Vehicle);
		
	}

}
