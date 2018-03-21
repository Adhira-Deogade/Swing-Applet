package course;

public class RunnableInMain {
	
	public synchronized static void m1() {
		System.out.println(" Inside m1 ");
		
		
	}
	
	public static void main(String [] args) {
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Hello "+i);
					//Thread.sleep(300);
					m1();
					
					
					
				}
			}
		});
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Hello "+i);
					//Thread.sleep(300);
					m1();
					
					
					
				}
			}
		});
		t3.start();
		t4.start();
	}

}
