// Use synchronized to control access

package multithreading;

class SumArray {
	private int sum;
	
	int sumArray(int nums[]) {
		sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			sum +=nums[i];
			System.out.println("Running total for " + Thread.currentThread().getName() + 
					" is " + sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException exc) {
				System.out.println("Thread interrupted.");
			}
		}
		return sum;
	}
}

class MySumThread implements Runnable {
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;
	
	// construct new thread
	MySumThread(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}
	
	@Override
	public void run() {
		
		System.out.println(thrd.getName() + " starting.");
		synchronized(sa) {
			answer = sa.sumArray(a);
		}
		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		
		System.out.println(thrd.getName() + " terminating.");	
	}
}

public class Sync {
	public static void main(String args[]) {
		int a[] = {1, 2, 3, 4, 5};
		
		MySumThread mt1 = new MySumThread("Child #1", a);
		MySumThread mt2 = new MySumThread("Child #2", a);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}
