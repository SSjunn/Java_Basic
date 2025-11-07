package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();

		person.action1((name, job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});

		// 실행문이 하나 일때는 생략이 가능!!
		person.action1((name, job) -> System.out.println(name + "이 " + job + "을 합니다."));
		
		
		// 재정의한 추상메서드의 매개변수가 하나일때 () 생략 가능
		person.action2((word) -> {
			System.out.print("\"" + word + "\"");
			System.out.println("라고 합니다.");
		});
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));

	}

}
