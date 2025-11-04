package ch02;

public class Variable {

	public static void main(String[] args) {
		int age; // 정수타입의 age라는 이름의 변수를 선언 (초기화 x)
		//System.out.println(age); //미초기화시 사용 불가(error : The local variable age may not have been initialized)
		
		// 변수에 값을 대입(저장)
		// 처음 대입 -> 초기화
		age = 10; // 10이라는 값을 age(변수)에 대입연산
		// age = 3.14; // 다른타입은 대입 불가
		
		age = 30; // age 변수에 30으로 대입(변경)
		
		//선언과 대입(초기화)을 동시
		int grade = 4;
		// 변수명 -> 의미있는 이름의 영어단어
		
		/*
		  	여러 의미를 갖는 경우 
		 	ex) 학생 나이
		 */
		int studentage = 10;
		//카멜(camel) 표기법
		int studentAge = 10;
		//스네이크(snake) 표기법
		int student_age = 10;
		
		// 회사직원이름
		String companyEmployeeName = "홍길동";
		System.out.println(companyEmployeeName);
		
		int a = 10;
		int b = 20;
		// 연산이 일어나면 int로 변경 따라서 byte a, byte b 로해서 바꿔주더라도 byte c = a + b는 안돼
		// byte c = a + b;
		int c = a + b ;
		
		char e  = 'A'; // 홑따옴표, 하나의 문자, A 아스키 코드 65
		char g = 65;
		int f = e + 1;
		System.out.println(f);
		
		float h = 3.14f; //3.14f 에서 f를 넣어준다. why? 소수점이 있는 숫자 값은 기본적으로 double이다.
		float j = h + h;
		double i = 3.14;
		
		long k = 21000000000L; // 뒤에 L이 없으면 error : out of range
		
		
		
		int L = 1;
		long L2 = k; // int -> long 변환 k에 들어간 값이 int니까 long으로 변환이 된거야. 
		
		short L3 = 10;
		L2 = L3; // short -> long
		L = L3; // short -> int 
		// 작은 타입에서 큰타입 으로는 바꿀 수 있어, 큰 타입에서 작은 타입으로는 못 바꿔
		
		// L3 = L2; // long -> short (에러)
		
		// float -> double(o), double -> float(x)
		
		int m = 3;
		double m2 = m;
		System.out.println(m2);
		
		double o = 3.14;
		int o1 = (int)o; // 강제(억지로) (int)를 사용해서 소수점 이하 유실
		System.out.println(o1);
		
		//문자열
		String n = "A";
		String n2 = ""; // 빈문자열
		String n3 = " "; // 공백문자열
		String n4 = null; // 값자체가 없음

		
		int n5 = 10;
		int n6 = 10;
		System.out.println(n5 == n6);
		
		//문자열도 참조 자료형이라고 했다.
		String n7 = "홍길동";
		String n8 = "홍길동";
		System.out.println(n7 == n8);
		
		//클래스로 객체 생성
		String n9 = new String("홍길동");
		String n10 = new String("홍길동");
		System.out.println("ck");
		System.out.println(n9 == n10);
		//false 가 나온 이유 : n9 랑 n10은 주소가 다르다. 참조 자료형은 주소값으로 비교를 하게 되어 있다.
		
		// 문자열일때 값으로 비교를 꼭 해줘야 한다.    .equals() 매서드를 꼭 사용해야 한다. 
		// 주소는 다르지만 값만 같으면 true
		System.out.println(n9.equals(n10));
		System.out.println(n7.equals(n8));
		
		boolean result = isDuplicatedId("test");
		boolean result2 = true;
		
		// Person : 부모, Man : 자식
		Person p = new Person();
		Man m10 = new Man();
		
		Person p2 = (Person)m10;
		Man m11 = (Man)p; // 강제 바꾸기 가능
		
	}

	
	static boolean isDuplicatedId(String id) {
		//..
		return false;
		
	}
	
}

class Person{
	
}
class Man extends Person{
	
}


