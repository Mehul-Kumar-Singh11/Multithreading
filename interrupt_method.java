package Interrupted_Methods;

public class interrupt_method extends Thread{
	@Override
	public void run() {
		try {
		for(int i=0;i<5;i++) {
		      System.out.println(i);
		      Thread.sleep(1000);
		  }
		}
		catch(Exception e) {
			System.out.println("Interrupted Exception" +  " " +e);
		}
	}

	public static void main(String[] args) {
		interrupt_method t = new interrupt_method();
		t.start();
		t.interrupt();
	}

}
