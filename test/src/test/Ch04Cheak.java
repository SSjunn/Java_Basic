package test;

import java.util.Scanner;

public class Ch04Cheak {

	public static void main(String[] args) {
		// 3번 문제
		int i;
		int sum = 0;
		for (i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("3의 배수의 총 합은 : " + sum);
		System.out.println();

		// 4번 문제
		/*
		 * 반복 주사위1 주사위2 주사위 1 + 주사위 2 == 5? 중지 아니면 반복
		 */
		while (true) {
			int dice = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice + "," + dice2 + ")");

			// 두 주사위 값(dice와 dice2)의 합이 5가 될 때까지 반복
			if (dice + dice2 == 5) {
				break;
			}
		}
		System.out.println();

		// 5번 문제
		// 4x + 5y = 60, x 와 y는 10 이하
		int x;
		int y;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}

		System.out.println();

		// 6번 문제 (직각 삼각형 별 찍기)
		for (int z = 1; z <= 5; z++) {
			for (int q = 0; q < z; q++) {
				System.out.print("*");
			}
			System.out.println(); // 불필요한 공백을 제거하고 줄 바꿈만 수행
		}
		System.out.println();

		// 7번 문제 (컴파일 오류 수정 및 무한 루프 방지)
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			String num = scanner.nextLine();
			if("1".equals(num)) {
				System.out.println();
				System.out.println("예금액>");
				int price = Integer.parseInt(scanner.nextLine());
				balance += price;
			}
			else if("2".equals(num)) {
				System.out.println();
				System.out.println("출금액>");
				int price = Integer.parseInt(scanner.nextLine());
				balance -= price;
			}
			else if("3".equals(num)) {
				System.out.println();
				System.out.println("잔고>"+balance);
			}
			else if("4".equals(num)) {
				System.out.println("프로그램 종료");
				break;
				
			}
		}
		


	}
}