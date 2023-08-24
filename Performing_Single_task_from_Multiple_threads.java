package Thread_Cases;

public class Performing_Single_task_from_Multiple_threads extends Thread {
	@Override
   public void run() {
	   System.out.println("Thread task");
   }
	public static void main(String[] args) {
		// thread 1
		Performing_Single_task_from_Multiple_threads t = new Performing_Single_task_from_Multiple_threads();
		t.start();
		// thread 2
		Performing_Single_task_from_Multiple_threads t2 = new Performing_Single_task_from_Multiple_threads();
		t2.start();
		
	}

}
