package ch04.sec02;

import java.util.Scanner;

public class ExampleCh04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
		    System.out.print("Score 점수 : ");
		    String Score1 = sc.nextLine();

		    // 종료 조건
		    if ("q".equals(Score1) || "Q".equals(Score1)) {
		        System.out.println("프로그램 종료");
		        break;
		    }

		    // 낙제
		    if ("0".equals(Score1)) {
		        System.out.println("0점은 낙제");
		        continue;
		    }

		    // 예외 처리
		    int Score;
		    try {
		        Score = Integer.parseInt(Score1);  // ← 숫자면 정상, 문자면 오류 발생
		    } catch (NumberFormatException e) {
		        System.out.println("다시 입력하세요");
		        continue;  // 다시 입력으로 돌아가기
		    }

		    // 점수 계산
		    if (Score >= 90) {
		        if(Score >= 95) {
		            System.out.println(Score + "점은 : A+");
		        } else {
		            System.out.println(Score + "점은 : A");
		        }
		    } else if (Score >= 80) {
		        System.out.println(Score + "점은 : B");
		    } else if (Score >= 70) {
		        System.out.println(Score + "점은 : C");
		    } else {
		        System.out.println(Score + "점은 : D");
		    }
		}
	}

}
