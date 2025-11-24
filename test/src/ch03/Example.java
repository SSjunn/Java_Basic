package ch03;

public class Example {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println(result);  // 출력 결과 : 0.29999999999999993
		
		// 정확한 결과가 나오지 않으므로
		// double pieceUnit 을 int 로 바꿔
		
		int apple1 = 10;
		int piceUnit1 = 1; // 나중에 나누면 될듯?
		
		int result1 = apple1 - number;
		System.out.println(result1 / 10.0);
	}

}
