package ch06.sec15;

public class Singleton {
	/*
	 * 기능적인거는 이렇게 해도 되지만 객체를 저장하는 DTO,VO 는 사용을 해서는 안된다.
	 * private static Singleton Singleton = null;
	 * 
	 * private static Singleton getINstance(){
	 * 	if(Singleton == null){
	 * 		return new Singleton();
	 *  }
	 *  return singleton;
	 * }
	 */
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();
	
	// private 접근 권한을 갖는 생성자 선언
	private Singleton(){
		
	}
	
	//public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}

}
