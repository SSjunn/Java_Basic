package ch06.sec07.exam04;

import javax.management.modelmbean.ModelMBean;

public class Car {
	// 필드 선언
	String company ="현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// static 블럭
	static {
//		model = ""; 여기서는 사용을 하지 못한다. 
		System.out.println("static 블럭 실행");
	}
	// instance 블럭
	{
		model = "";
		System.out.println("instance 블럭 실행");
	}
	
	
	// 생성자 선언
	Car(){
		System.out.println("생성자 실행");
	}
	
	Car(String model){
//		this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
