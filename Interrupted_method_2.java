package Interrupted_Methods;

public class Interrupted_method_2 extends Thread {
     @ Override
     public void run() {
    	 System.out.println(Thread.interrupted()); // return true and converts to false
    	 System.out.println(Thread.interrupted()); // return false and converts to true
    	 try {
    		  for(int i=1;i<=5;i++) {
    			  System.out.println(i);
    			  Thread.sleep(1000);	
    		      System.out.println(Thread.interrupted()); // returns false
    		  }
    	  }
    	  catch(Exception e) {
    		  System.out.println(e);
    	  }
     }
	public static void main(String[] args) {
		Interrupted_method_2 t = new Interrupted_method_2();
		t.start();
		t.interrupt();
	}

}
