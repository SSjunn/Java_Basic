package ch12.sec03.exam05;

import lombok.Getter;
import lombok.Setter;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Getter @Setter

public class Member {
	private String id;
	private String name;
	private int age;
	
	
	// lombok이 이름을 자동으로 만드는데 밑에 처럼 하면 새로운 정의를 하면 정의한 거를 빼고 만들어준다.
	public String getName() {
		return name+"님";
	}
	
}
