package ch12.sec03.exam01;

import javax.xml.crypto.Data;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
//		public void Data() {
//			System.out.println("Mon Nov");
//		}
//		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		
		}
		
//		Data data = new Data();
//		System.out.println(data.toString());
//		System.out.println(data);
	}

}
