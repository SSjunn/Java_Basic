package ch06.sec07.exam04;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();

		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();

		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();

		Car car4 = new Car("자가용","검정",200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		
		
		double a = 0;
		CarExample ce = new CarExample();
		int b = (int)ce.testMember(0); // 강제 형변환
	
		Math.random(); //static 메서드
//		Scanner.nextLine(); // 이거는 사용을 못해.
		double pi = Math.PI; //static 필드
		Scanner scan = new Scanner(System.in);
		scan.nextLine(); //instance 필드
		
		//Math 클래스의 생성자에 가보면 private 라고 되어 있다.
//		Math m = new Math();
		
		
		double height = ce.height; //static 필드
		
		
		
		
		
	}
	// static : 정적(고정) + 공유
	static double height = 0;
	void test(){
		System.out.println(1);
		if (true) return; // 메서드 실행 중지
		System.out.println(2); //Dead code
	}

	double testMember(int x){
		x++;
		test(); // 다른 메서드 실행 -> 이거는 가능해.
		if(x%2 ==0) return 0;
		System.out.println();
		return 1;
	}

}
