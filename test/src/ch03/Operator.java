package ch03;

public class Operator {
	public static void main(String[] args) {
		int x = 1;
		++x; // 전위연산
		System.out.println(x);
		int y = 1;
		y++; // 후위 연산
		System.out.println(y);
		int z = y++;
//		int z = y;
//		y+=1;
		System.out.println(y);
		
		// 정수와 정수이 연산결과는 정수
		int a = 10;
		int b = 3;
		System.out.println(a/b); // 몫이 출력
		System.out.println(a % b); // 나머지가 나와
		
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int total = kor +eng + math;
		double avg = (double)total / 3 ; // 둘 중 하나 이상이 반드시 실수여야 한다.
		System.out.println(avg);
		
		// 비교연산(같다, 다르다, 작다, 작거나 같다......
		// 비교연산 결과값이 boolean
		System.out.println(kor == 90); // 90과 kor이 같다            
		//이거 만약 new 로 해서 만들어서 주소를 가리키는 걸로 하면 틀린거 아님?
		int c = 80;
		int d = 80;
		//Integer  c = new c;
		
		
		
		/*
		 * // 논리연산도 결과값이 boolean // shortcut // A and B : 만약 A가 false 라면 b를 확인? 아니 확인을
		 * 안해 String name = null; System.out.println(kor == 90 && name.equals("홍길동"));
		 * // A or B : 만약 A가 true라면 B를 확인 x System.out.println(name == null ||
		 * name.equals("홍길동"));
		 */
		//대입 연산
		int e = 10;
		e += 5; // 5를 더하고 대입 -> c = c + 5
		e -= 5; // 5를 빼고 대입 -> c = c - 5
		// *= 이거는 거의 사용하는 사람이 없어.
		
		//삼항 연산
		int score = 60;
		String result = (score >= 60)?"합격" :"불합격";
		System.out.println(result);
		
		char grade  = (score >=90) ? 'A': ((score >= 80) ? 'B' : 'C'); // 괄호로 묶어서 사용을 한다. 해석을 하기 편하게
		System.out.println(grade);
		
		System.out.println(Math.pow(Math.round(3.14), 2));
		
		
		int pencils = 534;
		int students = 30;
		
		int PencilsPerStudent = pencils / students;
		System.out.println(PencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		System.out.println(PencilsPerStudent+" "+pencilsLeft);
		
		
		
		int value = 356;
		System.out.println((value/100)*100);
	}
}
