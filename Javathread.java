package asn5;

public class Javathread {
	public static void main(String args[]) {
	Adhira threads = new Adhira();
	threads.start();
	//threads.stop();
	}
}

class Adhira implements Runnable {
	
	// Instantiate a Thread
	Thread threads[] = new Thread[3];
	
	// Create start method
	public void start() {
		
		// create threads and start every time start is called
				for(int i=0;i<threads.length;i++) {
					threads[i]=new Thread(this,"Thread" + (i+1));
					threads[i].start();		
					System.out.println("Thread "+i+" started");
					//System.out.println(Thread.currentThread()+" started");
				}
				
				
		
	}
	
	// Create run method
	public void run() {
		Thread currentthread = Thread.currentThread();
		int index = getIndex(currentthread);
		
		for(int i = 0; i < 3; i++) {
		try {
		      //while(true) {
		    	  
		        //System.out.println("Thread "+i+" is running.");
		        System.out.println(index+" going to sleep");
		        Thread.sleep(1000);
		        
		        	synchronized(this){
		        	m1(i);
		        	}
		        	
		        	System.out.println("Thread "+i+" is waiting.");
		        	wait();
		        
		      }
		      //}
		      catch (InterruptedException e) {
		      System.out.println("Thread "+i+" Interrupted ");
		}
		
		System.out.println(" Thread "+i+" done sleeping.");
		  }
		}
		
	
	
	private void m1(int i) {
		// TODO Auto-generated method stub
		System.out.println("Method m1 syncs with: "+ i);
		notify();
		System.out.println("Thread: "+(i+1)+" is invoked");
		
	}

	private int getIndex(Thread current) {
		for(int i=0;i<threads.length;i++) {
			if(current==threads[i]) {
				return i;
			}}
			return -1;
		
	
	}
	
	// Create stop method
	public void stop() {
		for(int i=0;i<threads.length;i++) {
			threads[i]=null;

		}
notifyAll();
}
}
