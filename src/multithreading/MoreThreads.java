package multithreading;

public class MoreThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThreadImpr mt1 = new MyThreadImpr("Child #1");
		MyThreadImpr mt2 = new MyThreadImpr("Child #2");
		MyThreadImpr mt3 = new MyThreadImpr("Child #3");
		
		do {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		} while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive())
		System.out.println("Main thread ending.");
	}

}
