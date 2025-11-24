package ch14.sec06.exam01;

public class User2Thread extends Thread {
private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
//		calculator = new Calculator(); // 이렇게 하면 SynchronizedExample 에서 calculator가 겹치게 되면서 문제가 발생한다.
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}

}
