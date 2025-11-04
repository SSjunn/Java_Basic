package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner  = new Scanner(System.in); // 생성된 Scanner를 변수에 대입, System.in 키보드로부터 입력을 받는다.
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		
		// q를 입력하기 전까지는 계속해서 반복을 진행
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			/*
			 * if(data.equals("q")) { break; }
			 */
			if("q".equals(data)) {         //이렇게 작성을 하는게 좋아
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		
	}

}
