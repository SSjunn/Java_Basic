package ch06;

public class StudentVO {
	// 학생번호, 학생명, 학년
	// 이런 정보는 private 를 넣어둔다.
	private int number;
	private String name;
	private int grade;
	
	
	// 단축키
	// shift + alt + s -> r -> alt + a -> r
	
	// 넣어줄때
	public void setNumber(int number) {
		this.number = number;
	}
	//가지고 갈때
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
