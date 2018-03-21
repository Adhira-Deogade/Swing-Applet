package asn5;

public class TestMain {
	   @Deprecated
	public static void main (String args[]) {
	      LoopCountThread loopCountThread;                
	      loopCountThread = new LoopCountThread();  
	      loopCountThread.start();                  
	      try { System.in.read();
	} catch(java.io.IOException e) {
		   e.printStackTrace();
	      }
	      loopCountThread.stop();}
	      
	   //loopCountThread = null;
	   }
	

	class LoopCountThread extends Thread {
	  public void run() {
	      int Count = 0;
	      while (true) 
	      {
	        System.out.println("running,	iCount = " + Count++);   
	          try {Thread.sleep(1000);}                         
	          catch(InterruptedException e){}
	      }
	   }
	}
