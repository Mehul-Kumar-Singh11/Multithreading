package Thread_Cases;
public class Performing_Multiple_task_from_Multiple_thread{
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		t2.start();
		MyThread3 t3 = new MyThread3();
		t3.start();
	}
}
 class MyThread1 extends Thread {
	 @Override
	 public void run() {
		 System.out.println("Thread task-1");
	 }
 }
 class MyThread2 extends Thread {
	 @Override
	 public void run() {
		 System.out.println("Thread task-2");
	 }
 }
 class MyThread3 extends Thread {
	 @Override
	 public void run() {
		 System.out.println("Thread task-3");
	 }
 }