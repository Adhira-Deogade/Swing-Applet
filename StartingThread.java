package course;

// Extends Thread class

class runner extends Thread{
	
	public void m1() {
		synchronized(this) {
			System.out.println(" Inside m1 ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	@Override
	public void run(){

		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i);
			try {
				
				Thread.sleep(300);
				m1();
				notify();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}

public class StartingThread {
public static void main(String[] args) throws InterruptedException {
	runner runner1 = new runner();
	runner runner2 = new runner();
	runner runner3 = new runner();
	runner runner4 = new runner();
	runner1.start();
	runner2.start();
	runner3.start();
	runner4.start();
	
//	runner1.join();
//	runner2.join();
//	runner3.join();
//	runner4.join();
}
}

// We need .start() because if we call run, it runs the code in the main thread of the application.
// with start, it runs the code in its special thread.
// Two threads running concurrently
