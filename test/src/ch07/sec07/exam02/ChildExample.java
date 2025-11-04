package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		Child child  = new Child(); // 자식타입의 객체 생성
		
		// 자동 타입 변환
		Parent parent = child; // 부모 타입의 변수에 자식 객체를 대입(자동 형변환)
		
		// 메서드 호출
//		parent.method3(); // 자식한테 있는거라서 못쓴다. 
		parent.method1(); // 부모한테 있던 메서드
		parent.method2(); // 부모도 있고, 자식도 있어. / 근데 type 이 부모 (형변환 된 경우 재정의된 메서드가 실행)
		
		Child child2 = (Child)parent; // 원래 Child였기 때문에 다시 Child 로 강제형변환 가능
		child2.method3();
		
		Parent parent2 = new Parent();
//		parent2.method3();
		parent2.method1();
		parent2.method2();

	}

}
