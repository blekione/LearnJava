package multithreading;

class MyThreadTwo extends Thread {
	
	public MyThreadTwo(String name) {
		super(name);
		start(); // start the thread
	}
	
	// Entry point of thread
	public void run() {
		System.out.println(getName() + " starting");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + ", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " interrupted.");
		}
		System.out.println(getName() + " terminating");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");

		// First construct a MyThread object
		MyThreadTwo mt = new MyThreadTwo("Child #1");

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
