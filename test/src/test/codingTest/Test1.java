package test.codingTest;

public class Test1 {

	public static void main(String[] args) {
		// 테스트를 위한 간단한 실행
		Solution solution = new Solution();
		int m1 = 5000;
		int[] ledger1 = { 10000, -13000, -4000, -2000, 6500, -20000 };
		System.out.println("Result 1: " + solution.solution(m1, ledger1)); // 기대값: 1500
	}
}

class Solution {
	public int solution(int m, int[] ledger) {
		int account = 0;
		int limit = -m;
		for (int i = 0; i < ledger.length; i++) {
			int temp = account + ledger[i]; // 입금/출금액
			if (temp >= limit) { // 마이너스통장 한도 이상이면
				account = temp; // 잔고증명
			}
		}

		return account;
	}
}
