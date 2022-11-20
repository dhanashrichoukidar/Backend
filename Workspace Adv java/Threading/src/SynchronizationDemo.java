
public class SynchronizationDemo {


	public static void main(String[] args) {
		Printer printer = new Printer();
		Thread1 t1 = new Thread1(printer);
		Thread2 t2 = new Thread2(printer);
		t1.start();
		t2.start();
	}
}
class Thread1 extends Thread {
	Printer printer;
	public Thread1(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		System.out.println("Thread-1 started....");
		printer.print(10);
		System.out.println("Thread-1 Ends....");
	}
}
class Thread2 extends Thread {
	Printer printer;
	public Thread2(Printer printer) {
		this.printer = printer;
	}
	public void run() {
		System.out.println("Thread-2 started....");
		printer.print(12);
		System.out.println("Thread-2 Ends....");
	}
}

class Printer {
	public synchronized void print(int num) {
		for(int i = 1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i == 5) {
				notify();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
			
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
}