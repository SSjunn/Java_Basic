package ch04.sec04;

public class MultiplicationTableExample {
	public static void main(String[] args) {		
//		for(int n = 2; n<10; n++) {
//			System.out.println("***" + n + "단 ***");
//			for(int m = 2; m<10; m++) {
//				int answer = n*m;
//				System.out.println(n + "x" + m + "=" + answer);
//			}
//		}
//	}
		int sum = 0;
		int i = 1;
		while(i<101) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + " 합은 " + sum );
	}
}

