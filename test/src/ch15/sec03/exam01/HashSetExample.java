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
		// "부산", 5 map.put("서울", map.get("서울")+1);
		String[] city = {"서울","부산","제주","광주","부산","서울","서울","부산"};
		for(String c :city) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		
		//map 반복 Iterator
		Set<String> keys = map.keySet();
//		System.out.println(keys);
		Iterator<String> key_iter = keys.iterator();
		while (key_iter.hasNext()) {
			String key = key_iter.next();
			System.out.println(key + ":" + map.get(key));
//			System.out.println(key);
		}
		System.out.println();
		
		// 향상된 for문
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		// wpspflr타입 추론
		var map2 = new HashMap<String, Integer>();
		
		
		//LinkedHashMap => 순서 보장
		Map<String, Integer> map21 = new HashMap<>();
		map.put("가", 1);
		map.put("나", 1);
		map.put("다", 1);
		map.put("라", 1);
		
		for (String key : map21.keySet()) {
			System.out.println(key + ":" + map21.get(key));
		}
		
//		Map<String, Integer> map = new HashMap<>();
//		// "서울", 10
//		// "부산", 5 map.put("서울", map.get("서울")+1);
//		map.put("서울", map.getOrDefault("서울",0)+1);
//		System.out.println(map);
	}

}
