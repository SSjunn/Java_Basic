package ch12.sec12;

import java.lang.reflect.Method;


public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotation);
			
			method.invoke(new Service()); //invoke 는 실행을 이야기 하는거다.
			
			printLine(printAnnotation);
		}

	}
	private static void printLine(PrintAnnotation printAnnotation) {
		// TODO Auto-generated method stub
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i = 0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
