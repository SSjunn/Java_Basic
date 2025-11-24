package test;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Cheak {
	public static void main(String[] args) {
		
		// 7번 문제 (최대값 찾기)
		int[] array = { 1, 5, 3, 8, 2 };
		int temp = Integer.MIN_VALUE;
		
		// if문 뒤의 세미콜론(;) 제거
		for (int i = 0; i < array.length; i++) {
			if(temp < array[i]){ 
				temp = array[i];
			}
		}
		System.out.println("7번 문제 최대값: " + temp);
		System.out.println();
		
		// 8번 문제 (총합 및 평균)
		int[][] array1 = {
				{95, 86},
				{83,92, 96},
				{78, 83, 93, 87, 88}
		};
		int total = 0;
		int count = 0;
        
		// 바깥쪽 반복문의 조건 수정: array1.length 사용
		for(int i = 0; i < array1.length; i++) { 
			for(int j = 0; j < array1[i].length; j++) {
				total += array1[i][j];
				count++; // 요소 개수를 정확하게 1씩 증가
				
			}
		}
        
		System.out.println("8번 문제 총합: " + total);
		double avg = (double)total / count;
		System.out.println("8번 문제 평균: " + avg);
		
		// 9번 문제
		/*
		  Scanner 객체 생성
		  학생점수 배열선언
		  while
		  	- 출력
		  	1이면
		  		- 학생입력
		  		- 학생수만큼 배열 초기화
		  	2이면
		  		- 배열개수만큼 반복 입력, 저장
		  	3이면
		  		- 배열전체 출력
		  	4이면
		  		- 최고점수
		  		- 평균 출력
		  	5이면 종료
		  
		 */
		Scanner scanner = new Scanner(System.in); 
		int [] scores = null; 
		
		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석  | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			String num = scanner.nextLine();
			
			if ("1".equals(num)) {
				System.out.print("학생수> ");
				int count1 = Integer.parseInt(scanner.nextLine());
				// 1. count 대신 count1 사용으로 수정
				scores = new int[count1]; 
			} else if ("2".equals(num)) {
				if (scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
					continue;
				}
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					int score = Integer.parseInt(scanner.nextLine());
					scores[i] = score;
				}
			} else if ("3".equals(num)) {
				// 2. 널 체크 추가
				if (scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
					continue;
				}
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if ("4".equals(num)) {
				if (scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
					continue;
				}
				
				int max_score = 0;
				int total_score = 0; // 8번 문제 total과 이름이 겹치지 않도록 total_score로 변경
				
				for (int i=0; i<scores.length; i++) {
					// total 대신 total_score 사용으로 수정
					total_score += scores[i]; 
					if (max_score < scores[i]) max_score = scores[i];
				}
				System.out.println("최고 점수: "+max_score);
				// total 대신 total_score 사용으로 수정
				System.out.println("평균 점수: "+(double)total_score / scores.length); 
			} else if ("5".equals(num)) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		
		
	} 
}