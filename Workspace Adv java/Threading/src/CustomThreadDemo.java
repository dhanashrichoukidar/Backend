
public class CustomThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main Thread Started...");
		
		CustomThread ct= new CustomThread(); // Born/New Stage
		ct.setPriority(10);
		ct.setName("My-Custom-thread");
		ct.start(); // to make thread ready to run (it will not start a thread)  // Runnable Stage
		
		System.out.println("Main Thread Ends...");
	}
}

class CustomThread extends Thread
{
	public void run() {   // Running Stage
		System.out.println("Custom Thread started...");
		System.out.println(Thread.currentThread());
		System.out.println("Custom Thread ends...");
	}
}