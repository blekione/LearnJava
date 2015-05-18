package multithreading;

// create thread by implementing Runnable

class MyThread implements Runnable {
	String thrName;
	
	public MyThread(String name) {
		this.thrName = name;
	}
	
	// Entry point of thread
	public void run() {
		System.out.println(thrName + " starting");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + thrName + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrName + " interrupted.");
		}
		System.out.println(thrName + " terminating");
	}
}

public class UseThreads {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		
		// First construct a MyThread object
		MyThread mt = new MyThread("Child #1");
		
		// Next, construct thread from that object
		
		Thread newThr = new Thread(mt);
		
		// Finally, start execution of the thread
		
		newThr.start();
		
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
