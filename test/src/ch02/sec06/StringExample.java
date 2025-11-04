package ch02.sec06;

public class StringExample {
	public static String email; // 멤버변수
	
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; // "자바"에 쌍따옴표를 하고 싶으면 좌우에 \ \ 넣어줘야 한다.
		System.out.println(str);
		
		str = "번호\t이름\t작업"; // tab 키이다. 8칸 아니면 10칸 정도 된다고 기억함
		System.out.println(str);
		
		/* \n은 한 줄을 띄어쓰기 한다. 근데 여기서 println으로 되어 있다면 ln 이 줄바꿈으로 되어 있는거야. */
		System.out.print("나는\n"); 
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	
		System.err.println("나는 \n 자바를\n배웁니다.\n");
		
		String text = """
				나는
				자바를
				배웁니다."""; // 이 방법은 비 추천한다. 범용적이지 않아.
		System.out.println(text);
		
		// 문자열도 연산이 가능
		String n = "홍길동";
		String n2 = n + "님";
		System.out.println(n2);
		String n3 = "3" + 1;
		System.out.println(n3);
		String n4 = "3" + String.valueOf(1); //String.valueOf() : 기본 타입을 문자열로 변경해준다.
		// 문자 + 숫자 = 숫자가 문자로 형변환 -> 응용
		int age = 10;
		String age2 = age + ""; // 빈 문자열을 더해버려서 문자열로 바꿔버려
		String age3 = age + 3 + "";
		String age4 = age + (3 + "");
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
		// int age3 = age2 + 10; 이거는 될 수가 업서.
		int age5 = Integer.parseInt(age2) + 10; // 이렇게 해서 바꾸는거야
		System.out.println(age5);
		
		Integer age6 = new Integer(100);
		System.out.println(age6);
		
		if (age5 == 23) {
			int age7 = 10;
			System.out.println(age7);
		}
		//System.out.println(age7); // 사용 불가
	}
	
	public static void test() {
		//System.out.println(age6); // age 6를 변수로 사용을 할 수 가 없다.
		email = "";
		
	}

}
