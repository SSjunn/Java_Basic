package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 80;
		
		if(score >= 90){
		System.out.println("점수가 90보다 큽니다");
		System.out.println("등급은 A입니다.");

		}else { // 90미만
			System.out.println("else");
			
		}
		if(score < 90)
			System.out.println("점수가 90보다 큽니다"); // 딱 한줄만 if 문의 영역이 된거다.
			System.out.println("등급은 B입니다."); // 이게 왜 출력이 된거냐? if 문과는 상관 없는 실행문
			
			
	        // 90 이상이면 A, 80 이상이면 B, 나머지는 C
	        int point = 90;
	        if (point >= 90) {
	            System.out.println("A");
	        } else if (point >= 80) {
	            System.out.println("B");
	        } else {
	            System.out.println("C");
	        }
	        
	        
			// 주사위(눈이 6개), 1부터
			// 공식 : int n = (int)(Math.random()* 개수) + 시작값;
			int n = (int)(Math.random()* 6) + 1;
			System.out.println(n);
			
			// 동전 앞 뒤면
			int n2 = (int)(Math.random()* 2);
			System.out.println(n2);
	}
}
