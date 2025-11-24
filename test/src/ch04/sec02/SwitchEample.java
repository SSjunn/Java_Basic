package ch04.sec02;

import java.util.Scanner;

public class SwitchEample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {		
			System.out.println("멈추고 싶으면 q or Q를 눌러 계속할거면 아무거나 ㄱ : ");
			String key = sc.nextLine();
			
			if("q".equals(key) || "Q".equals(key)) {								
				System.out.println("종료");
				break;
			}			
			System.out.println("숫자 뽑아!");
			int num = (int)(Math.random() * 7); // 0~6
			switch (num) {
			case 1:
				System.out.println("1번 나와");
				break;
			case 2:
				System.out.println("2번 나와");
				break;
			case 3:
				System.out.println("3번 나와");
				break;
			case 4:
				System.out.println("4번 나와");
				break;
			case 5:
				System.out.println("5번 나와");
				break;
			default:
				System.out.println("6번 나와");
				break;
			}
		}
	}
}
