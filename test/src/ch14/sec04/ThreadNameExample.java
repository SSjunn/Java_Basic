package ch14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+"실행");
		
		
		for(int i= 0; i<3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행"); // getName()은
					
				}
			};
			threadA.start();
		}
		Thread chatTrhead = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatTrhead.setName("chat-thread");
		chatTrhead.start();

	}

}
