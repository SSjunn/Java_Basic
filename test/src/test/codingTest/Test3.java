package test.codingTest;

import java.util.Arrays;

/*
 * 물품 1~n 개
 * 참가자 1~ m개
 * 경매 0원부터 10,000 원
 * 자본이 제일 많은 사람이 우선권 가짐
 * 자본이 가장 많은 사람 비슷 -> 번호 낮은 사람이 낙찰
 * 
 * 자 n은 고객이니까 1부터n까지고
 * amounts는 1번부터 하나씩 꽂아
 * 
 * 
 */



public class Test3 {
	public int[] solution(int n, int[] amounts) {
		int[] amo1 = amounts;
		for (int i = 0; i<amo1.length; i++) {
			sysout
			 amo1[i]
			
		}
		Arrays.sort(amo1);
		System.out.println("오름 차순"+Arrays.toString(amo1));
		
		int[] answer = {0};
		
		


		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     	int[] amo = {1000000,490000,700000,290000};
	     	Test3 test = new Test3();
	     	test.solution(4, amo);

	}

}
