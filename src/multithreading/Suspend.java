// Suspending, resuming and stopping thread

package multithreading;

class MySuspendThread implements Runnable {
	Thread thrd;
	
	boolean suspended;
	boolean stopped;
	
	MySuspendThread(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
 	
	@Override
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10)  == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				// Use synchronized block to check suspended and stopped
				synchronized(this) {
					while (suspended) {
						wait();
					}
					if (stopped) break;
				}
			}
			
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
	
	// Stop the thread
	synchronized void myStop() {
		stopped = true;
		//the following ensures that suspended thread can be stopped;
		suspended = false;
		notify();
	}
	
	// Suspend the thread
	synchronized void mySuspend() {
		suspended = true;
	}
	
	// Resume the thread
	synchronized void myResume() {
		suspended = false;
		notify();
	}
}

public class Suspend {

	public static void main(String[] args) {
		MySuspendThread ob1 = new MySuspendThread("My Thread");
		
		try {
			Thread.sleep(1000); // let ob1 thread start executing
			
			ob1.mySuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myResume();
			System.out.println("Resume thread.");
			Thread.sleep(1000);
			
			ob1.mySuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);
			
			ob1.myResume();
			System.out.println("Resume thread.");
			Thread.sleep(1000);
			
			ob1.mySuspend();
			System.out.println("Stopping thread");
			ob1.myStop();
			
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}

		//wait for thread to finish
		try {
			ob1.thrd.join();
		}catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("Maint thread stopping.");
	}

}
