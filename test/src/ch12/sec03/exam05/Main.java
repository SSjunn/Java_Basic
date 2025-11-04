package ch12.sec03.exam05;

public class Main {

	public static void main(String[] args) {
		 Member m = new Member();
		 m.setName("홍길동");
		 m.setAge(30);
		 m.setId("hone");
		 System.out.println(m);
		 // Member(id=hone, name=홍길동, age=30) 이게 lombok의 기능이야.

	}

}
