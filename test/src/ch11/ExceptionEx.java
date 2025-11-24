package ch11;

public class ExceptionEx {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("시작");
		int a = 10;
		int b = 1;
		int c = 0;
		int[] arr = { 1, 2, 3 };
		String name = null;
//		try {
////			test();
//		} catch (InterruptedException e) {
//
//		}

		try {
			// 해결 방법 1. tyr 안에 넣으면 error 가 나지 않는다.
			// 해결 방법 2. public static void main(String[] args) throws
			// ClassNotFoundException{}
			Class.forName("java.lang.String"); // Unhandled exception type ClassNotFoundException 이런 에러가 나온다.

		} catch (ClassNotFoundException e) {

		}
		try {// 시도
			c = a / b; // b 가 0이기 때문에 나온 에러 // 예외 발생 (프로그램 중지)
			System.out.println(arr[2]);
			System.out.println(name.length());
			System.out.println("실행문 마지막");// 이거는 실행이 안돼 예외가 발생해서 catch 로 넘어가진다.
//		} catch (ArithmeticException e) { // 잡아내
//			System.out.println("예외발생!"); // 예외 발생시 실행 블록		
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("index 예외");
		} catch (Exception e) { // 모든 예외 잡아내
//			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("모든 예외처리");
		} finally { // 마지막으로 항싱 실행 // 예외가 있어도 없어도 실행이 된다.
			System.out.println("무조건 실행");

		}
		System.out.println(c);
		System.out.println("끝");
	}
//
//	public static void test() {
//		try {
//			throw new SomeException("어떤 예외 발생!!");
//		}catch (SomeException e) {
//			System.out.println(e.getMessage());
//		}
//		}
	class SomeException extends Exception{
		public SomeException(){
			
		}
		public SomeException (String msg) {
			
		}
	}
}
