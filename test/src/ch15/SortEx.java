package ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *배열 : Arrays.sort(null);
		 *컬렉션
		 *
		 *
		 *
		 *기본자료형 : Arrays.sort(변수)
		 *
		 *참조자료형 : Arrays.sort(변수, Comparator객체_)
		 *
		 *
		 */
//		Arrays.sort(null);
		
		//기본자료형 배열
		int [] array = {8,1,6,2,4,};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); //배열 찍고 싶으면 Arrays.toString(원하는배열)
//		Arrays.sort(array,Comparator.reverseOrder()); 이거 안된다. 
		
		Integer[] array3 = {8,1,6,2,4};
		Arrays.sort(array3,Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(array3));
		
		
		//문자열 배열
		
		
		String [] array2 = {"서울","부산","광주","제주","대구","경기"};
		Arrays.sort(array2,Comparator.reverseOrder());
//		Arrays.sort(array2); 오름차순 정렬 
		System.out.println(Arrays.toString(array2));
		
		//내림차순 안됨
		
		
		/////////////////////////////////////////////
		//컬렉션
		
		List<Integer> list = new ArrayList<>(); //배열들어오면 리스트로바꾼다
		list.add(8);
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(4);
		
		System.out.println(list);  //list는 toSTring 재정의 되어있음 
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		//-------------------
		//리스트 안에 맵객체
		//맵안에는 이름, 나이 
		
//		List<Map<String,Object>> list2 = new ArrayList<>();
//		
//		Map<String,Object> map = new HashMap<>();
//		map.put("name", "홍길동");
//		map.put("age", "20");
//		
//		list2.add(map);
//		
//		map = new HashMap<>();
//		map.put("name", "좌민석");
//		map.put("age", "1");
//		
//		list2.add(map);
//		
//		map = new HashMap<>();
//		map.put("name", "좌은서");
//		map.put("age", "200");
//		
//		list2.add(map);
//		
//		for(Map m : list2) {
//			System.out.println(m);
//		}
//		
//		Collections.sort(list2,new Comparator<Map>(){
//			@Override
//			public int compare(Map a, Map b) { //추상메서드가 하나밖에 없으면 람다식 활용가능 
//				
//				return (int)a.get("age")) - (int)(b.get("age")) ; //앞에서 뒤꺼 빼면 오름차순
//				
//			}
//		});
//		
//		for(Map m : list2) {
//			System.out.println(m);
//		}
		
		
//		
		int [][] array4 = {
				{1,34},{2,300},{3,99},{4,200}
		};
		//두번째 값을 기준으로 오름차순으로 ?
		
		
//(기본형은 Comparator를 쓸 수 없기 때문)
	
//		Arrays.sort(array4, new Comparator<int[]>() {  //array4는 기본자료형이 아님! 
//			
//			@Override
//			public int compare(int[] a , int []b) {
//				
//				return a[1] - b[1];    //배열끼리 비교하라는거아님? 
//			}
//			
//		});
		
//		
		Arrays.sort(array4,(o1 ,o2) -> {
			return o1[1] - o2[1];
		}); //람다표현식
		
		for(int[] a : array4) {
			System.out.println(Arrays.toString(a));
		}
		
		
		
		
		
		
//		List<Person> llist = new ArrayList<>();
//		
//		llist.add(new Person(5,"민석"));
//		
//		llist.add(new Person(10,"은서"));
		
		
		
		/*
		 * 객체정렬
		 * - Comparable 인터페이스를 구현 
		 * Comparator 인터페이스를 구현객체 (익명구현객체, 람다식)
		 */
		
		//리스트 안에 맵객체
		//맵 안에는 이름, 나이 (나이순으로 정렬)
		
		
//		Collections.sort(null);

		
		
		
//		
		test(()->{
			
		});
		
		Thread t = new Thread(()->{
			//여기 재정의 
		});
		
		
		
	}
	
	static void test(Xinterface x) {
		x.test();
	}

}