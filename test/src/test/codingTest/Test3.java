package test.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	// 경매 낙찰 금액
		public static int[] solution(int n, int[] amounts) {
			// 참가자 m명, 물건 n개
			// (참가자 번호, 자본) 쌍으로 pair를 만들고
			// n만큼 정렬 반복
			// 자본을 내림차순으로 정렬, 자본이 같다면 참가자번호로 오름차순
			int[] answer = new int[n];
			

			List<int[]> list = new ArrayList<>(); 
			for(int i=0; i< amounts.length;i++) {
				int[] temp = {0,0};
				temp[0] = i+1; temp[1] = amounts[i];
				list.add(temp);
			}
			for(int[] a : list) System.out.println(Arrays.toString(a));
			
			for(int i = 0; i<n; i++) {
				// 자본 기준 내림차순 정렬
				Collections.sort(list, (int[] o1, int[] o2)->{
					if(o1[1] == o2[1]) return o1[0] - o2[0];
					return o2[1] - o1[1];
				});
				
				int[] first = list.get(0);
				int[] second = list.get(1);
				
				// 자본 같은 경우
				if(first[1] == second[1]) {
					answer[i] = first[1];
					first[1] = 0;	// 모두 지불
					continue;
				}
				
				answer[i] = second[1] + 10000;
				first[1] -= answer[i];
				 
			}

			for(int[] a : list) System.out.println(Arrays.toString(a));
			
		
			return answer;
		}
}
