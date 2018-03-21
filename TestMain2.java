//package asn5;
//
//public class TestMain2 {
//
//	public static void main (String args[]) {
//
//		  LoopCountThread loopCountThread;                
//	      loopCountThread = new LoopCountThread();  
//	      loopCountThread.run();        
//	      try { System.in.read();
//	} catch(java.io.IOException e) {
//		   e.printStackTrace();
//	      }
//	      loopCountThread=null;}
//
//	   }
//	
//
//	class LoopCountThread implements Runnable {
//		
//	  public void run() {
//	      int Count = 0;
//	      while (true) 
//	      {
//	        System.out.println("running,	iCount = " + Count++);   
//	          try {Thread.sleep(1000);}                         
//	          catch(InterruptedException e){}
//	      }
//	   }
//	}
