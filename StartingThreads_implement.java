package course;

// Implements runnable
// Runnable just has one method in it public void run
class runners implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("Hello "+i);
			try {
				Thread.sleep(300);
			}catch(InterruptedException e){
				e.printStackTrace();				
			}
			
			
		}
	}
	
}

public class StartingThreads_implement {
public void main(String [] args) {
	Thread t1 = new Thread(new runners());
	Thread t2 = new Thread(new runners());
	
	t1.start();
	t2.start();
	
}
}
