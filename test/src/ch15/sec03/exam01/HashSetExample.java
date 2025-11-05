package ch15.sec03.exam01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("JAVA");
		set.add("JDBS");
		set.add("JSP");
		set.add("JAVA"); // 중복 객체이므로 저장하지 않음
		set.add("Spring");

		int size= set.size();
		System.out.println("총 객체 수: "+ size);
		System.out.println(set.toString());
		
		// 향상된 for문
		for(String e : set) {
			System.out.println(e);
		}
		
		// iterator()
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
//			String e = iter.next();
			System.out.println(iter.next().toString());
		}
		
		Map<String, Integer> map = new HashMap<>();
		// "서울", 10
		// "부산", 5
		map.put("서울", map.getOrDefault("서울",0)+1);
		
	}

}
