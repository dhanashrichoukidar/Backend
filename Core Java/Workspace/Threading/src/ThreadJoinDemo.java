public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Started....");
		
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		
		try {
			joinThread.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Ends....");
	}
}

class JoinThread extends Thread {
	@Override
	public void run() {
		System.out.println("JoinThread Started....");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("JoinThread Ends....");
	}
}