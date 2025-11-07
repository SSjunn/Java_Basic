package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Change {

	public static void main(String[] args) {
		/*
		 * 배열 <-> 리스트
		 * 
		 */
		int[] array1 = { 1, 2, 3 };
		
		// List로 변환
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i<array1.length; i++) {
			list1.add(array1[i]);
		}
		System.out.println(list1);
		List<Integer> list2 =Arrays.asList(  // List로 변환
				// boxed() 를 써서 INteger 로 만들고
				// toArray() Integer[]::new 로 새로 만든거야.
				Arrays.stream(array1).boxed().toArray(Integer[]::new) // Integer[] 배열로 변환
				);
		System.out.println(list2);
		
		// 리스트를 기본자료형(int) 배열로 변환 - 정말 많이 쓴다.
		// mapToInt(매개변수 ->  return) // 매핑을 시켜서 나와야해.
		// .toArray() // 배열로 만들어.
		// stream + lambda
		int[] array2 = list1.stream().mapToInt(i -> i).toArray();  /* 이거 외워!! */
		
		// for
		int[] array3 = new int[list1.size()];
		for (int i = 0; i<array3.length; i++) {
			array3[i] = list1.get(i);
		}
		System.out.println(Arrays.toString(array3));
		
		
		// 문자열(참조 자료형)
		String[] array4 = {"김길동","김바덕","홍길동"};
		List<String> list3 = Arrays.asList(Arrays.stream(array4).toArray(String[]::new));
		
		String[] array5 = list3.stream().toArray(String[]::new); /* 이거 외워!! */
		System.out.println(Arrays.toString(array5));
		
	}
	/*
	 * String[] solution() { return list }  // 이렇게 하면 안돼!! 말이 안되는거야.
	 */
}
