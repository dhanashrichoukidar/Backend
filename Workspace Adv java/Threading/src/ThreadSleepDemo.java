
public class ThreadSleepDemo {

	public static void main(String[] args) {
		
		SleepThread st = new SleepThread();
		st.start();
		
	}
}

class SleepThread extends Thread {
	@Override
	public void run() {
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(2000);// the sleep time in milli-seconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}