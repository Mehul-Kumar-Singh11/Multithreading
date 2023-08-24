package Thread_Cases;

public class Performing_Single_task_from_Single_thread extends Thread{
	@Override
   public void run() {
	   System.out.println("Thread task");
   }
	public static void main(String[] args) {
	Performing_Single_task_from_Single_thread t = new Performing_Single_task_from_Single_thread();
	t.start();
	}
}
// total number of threads: 2
// -->1) main() thread: bydefault created by JVM
// -->2) by user: 't' thread