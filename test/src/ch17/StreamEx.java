package ch17;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEx {
	public static void main(String[] args) {
		// 스트림 : 내부 반복자
		// 반복(처리)을 편하게 하는 용도로 용도
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"홍길동"));
		list.add(new Student(2,"김길동"));
		list.add(new Student(3,"최길동"));
		// 출력
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// for 문을 쓰나 forEach로 한 번 쓰나 결과는 똑같다
		list.stream().forEach(s->System.out.println(s));
	}

}



@Data
@AllArgsConstructor
class Student{
	private int no;
	private String name;
}