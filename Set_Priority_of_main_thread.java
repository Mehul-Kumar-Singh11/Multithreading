package Priority_methods;

public class Set_Priority_of_main_thread extends Thread {
   @Override
   public void run() {
	   System.out.println("Child thread");
	   // child thread inherits the priority of parent class by deafult
	   System.out.println(Thread.currentThread().getPriority());
//	   Thread.currentThread().setPriority(1);
//	   System.out.println(Thread.currentThread().getPriority());
   }
	public static void main(String[] args) {
    System.out.println("MAIN THREAD");
    Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	Set_Priority_of_main_thread t = new Set_Priority_of_main_thread();
	t.start();
	}

}
