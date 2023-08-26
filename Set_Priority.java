package Priority_methods;

public class Set_Priority extends Thread {
    @Override
    public void run() {
		System.out.println("Child thread priority: " +Thread.currentThread().getPriority());
    	System.out.println("Child thread");
    }
	public static void main(String[] args) {
     System.out.println("Main thread");
     // By default, main thread is 5.
	 System.out.println("Main thread priority: " +Thread.currentThread().getPriority());
     Set_Priority t = new Set_Priority();
     // priority range is from 1 to 10, if other then these values are used
     // we will get IllegalArgumentException 
     t.setPriority(10);  // (OR) t.setPriority(MAX_PRIORITY);
     t.start();
	}
}
