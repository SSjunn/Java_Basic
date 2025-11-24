package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X의 값은 : ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		
		System.out.print("Y의 값은 : ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);
		
		int answer = x + y;
		System.out.println("x+y : " + answer);
		
		while(true) {
			System.out.println("문자열을 입력: ");
			String data = sc.nextLine();
			if("q".equals(data)) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
	}
	
}
