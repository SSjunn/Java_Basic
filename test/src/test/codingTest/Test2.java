package test.codingTest;

import java.util.Arrays;

/*
 * 등급 
 * requests : 사람수
 * tickets : 한정된 티켓의 개수
 * result : 판 개수 구하고 싶은거 판 개수
 * int [][] 이거 등급 순으로 바꿔 => 람다 사용하고 o1[0] 오름차순 돌려
 * 두번째 index 비교 해서 순서대로 한거에서 뒤에 배열을 하나씩 빼주면서 비교
 * 그리고 출력?
 */

public class Test2 {
	public int solution (int tickets, int[][] requests) {
		
		int[][] buyer = requests;
		int soldTickets = 0;		
		
		// 배열 람다
		Arrays.sort(buyer,(o1 ,o2) -> o1[0] - o2[0]);
		// for 문으로 출력
		for(int[] b : buyer) {
			if(tickets - b[1] >= 0/*tickets-배열의 2번째 인덱스*/) {
				tickets -= b[1]; // 요청 티켓만큼 빼기
			    soldTickets += b[1];
			    System.out.println("누가 삼? " + Arrays.toString(b));
			    System.out.println(soldTickets);
			}
		}
		return soldTickets;
		
		
	}
	public static void main(String[] args) {
        int[][] req = {{1,9}, {3,6}, {2,5}, {3,5}};
        Test2 test = new Test2();
        test.solution(8, req);
	}
}

