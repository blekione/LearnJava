package multithreading;

// create thread by implementing Runnable

class MyThreadImpr implements Runnable {
	Thread thrd;
	
	public MyThreadImpr(String name) {
		thrd = new Thread(this, name);
		thrd.start(); // start the thread
	}
	
	// Entry point of thread
	public void run() {
		System.out.println(thrd.getName() + " starting");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating");
	}
}

public class UseThreadsImproved {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		// First construct a MyThread object
		MyThreadImpr mt = new MyThreadImpr("Child #1");
		
		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		System.out.println("Main thread ending.");
	}
}
