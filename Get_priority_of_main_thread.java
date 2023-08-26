package Priority_methods;

public class Get_priority_of_main_thread extends Thread{
     @Override
     public void run() {
    	 // here,child thread inherits the priorities of parent class(here,main)
 		System.out.println(Thread.currentThread().getPriority());
    	 System.out.println("Child thread");
     }
	public static void main(String[] args) {
		System.out.println("Main thread");
		// by default,main thread priority is 5.(NORM_PRIORITY)
		System.out.println(Thread.currentThread().getPriority());
		Get_priority_of_main_thread t = new Get_priority_of_main_thread();
		t.start();
	}
}
