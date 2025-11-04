package ch04.sec04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// for(1초기화; 2조건; 3증감)
		// 실행 순서 : 1 -> 2 -> 실행문 -> 3 -> 2...
		int i;
		int sum = 0;
		for(i = 1; i<= 100; i++) {
			System.out.print(i + " ");
			sum +=i;
		}
		System.out.println(sum);
		
		// 구구단
		// 중첩반복문 정확하게 이해를 하는게 중요해
		// 2단 출력
		for(int k = 2; k<= 9; k++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(k+ " * "+ j + " = " + k * j);
			}
		System.out.println("\n");
		}
	}
}
