package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드에 입력을 받겠다.
		boolean run = true; // flag 변수 => while 문 사용 용도로 쓰기 위해서
		int speed = 0; // 속도

		while (run) { // run이 true이면 계속 반복
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택 : ");

			String strNum = scanner.nextLine(); // 사용자 입력

			if ("1".equals(strNum)) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if ("2".equals(strNum)) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if ("3".equals(strNum)) {
				run = false;
			}
		}
		System.out.println("현재 속도= " + speed);
		System.out.println("프로그램 종료");
	}

}
