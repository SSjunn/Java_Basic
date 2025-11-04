package ch11;

public class StringEx {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println(name);
		System.out.println(name.toString());
		
		Member m = new Member();
		System.out.println(m.name);
		System.out.println(m.toString());
		System.out.println(m); // .toString()이 이미 실행이 되고 있는거다.

	}

}

class Member extends Object{
	String name = "김길동";
	
	@Override
	public String toString() {
		System.out.println("toString() 실행");
		return name;
	}
}
