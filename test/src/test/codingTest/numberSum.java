package test.codingTest;

import java.util.Scanner;

public class numberSum {
	
	public static void main(String[] args) {
		
		String s = "5";         
		String nNum = "54321";
		
		// char [] Account = nNum.toCharArray(); // 문자 배열 (선택사항, charAt이 더 간단)
		
		int sum = 0; // 자릿수 합계를 저장할 변수
		
		// 2. 문자열의 길이만큼 반복
		for(int i = 0; i < nNum.length(); i++) {
			char digitChar = nNum.charAt(i); 
			
			sum += digitChar - '0'; //    (아스키 코드 값에서 '0'의 아스키 코드 값 48을 빼는 연산) 이거 체크 
		}
		
		System.out.println("문자열: " + nNum);
		System.out.println("자릿수의 합계: " + sum); // 결과: 15
	}
}

/*
 * package test.codingTest;

import java.util.Scanner;

public class numberSum {
	
	public static void main(String[] args) {
		// ※ 하드코딩된 변수 s와 sNum은 실제 로직에 불필요하므로 제거하거나 무시합니다.
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 숫자 개수 (n)를 입력받습니다. (이 값은 필수는 아니지만, 문제에 따라 필요할 수 있습니다.)
		// int n = scan.nextInt(); 
		
		// 2. 숫자 문자열을 입력받습니다.
		String nNum = scan.next(); // 예: "5321" 입력
		
		int sum = 0; // 자릿수 합계를 저장할 변수
		
		// 입력받은 문자열의 길이만큼 반복합니다.
		for(int i = 0; i < nNum.length(); i++) {
			
			// 3. i번째 문자를 가져옵니다.
			char digitChar = nNum.charAt(i); // 예: '5', '3', '2', '1'
			
			// 4. ***핵심 수정 부분: 문자를 정수로 변환하여 sum에 더합니다.***
			//    (문자 '0'의 아스키 코드 값을 빼서 실제 숫자 값을 얻습니다.)
			sum += digitChar - '0'; 
			
			// 또는 Integer.parseInt()를 사용해도 됩니다:
			// sum += Character.getNumericValue(digitChar);
		}
		
		System.out.println(sum); // 결과 출력 (예: 5 + 3 + 2 + 1 = 11)
		
		scan.close();
	}
}
 */


