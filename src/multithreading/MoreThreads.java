package multithreading;

public class MoreThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		MyThreadImpr mt1 = new MyThreadImpr("Child #1");
		MyThreadImpr mt2 = new MyThreadImpr("Child #2");
		MyThreadImpr mt3 = new MyThreadImpr("Child #3");
		
			try {
				mt1.thrd.join();
				System.out.println("Child #1 joined");
				mt2.thrd.join();
				System.out.println("Child #2 joined");
				mt3.thrd.join();
				System.out.println("Child #3 joined");
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		
		System.out.println("Main thread ending.");
	}

}
