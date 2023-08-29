package Interrupted_Methods;

public class Interrupted_method extends Thread {
     @ Override
     public void run() {
    	 System.out.println(Thread.interrupted()); // return true and converts to false
    	  try {
    		  for(int i=1;i<=5;i++) {
    			  System.out.println(i);
    			  Thread.sleep(1000);	  
    		  }
    	  }
    	  catch(Exception e) {
    		  System.out.println(e);
    	  }
     }
	public static void main(String[] args) {
		Interrupted_method t = new Interrupted_method();
		t.start();
		t.interrupt();
	}

}
