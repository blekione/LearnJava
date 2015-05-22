/*
 * Demonstrate a generic queue class
 */

package generic_queue;

public class GenQDemo {

	public static void main(String[] args) {
		// Create an Integer queue
		Integer iStore[] = new Integer[10];
		GenQueue<Integer> q = new GenQueue<Integer>(iStore);
		Integer iVal;
		
		System.out.println("Demonstrate a queue of Integers.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + i + " to q.");
				q.put(i); // add integer value to q
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		
		try {
			for (int i = 0; i < 0; i++) {
				System.out.println("Getting next Integerfrom q: ");
				iVal = q.get();
				System.out.println(iVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		
		// Creating a Double queue
		Double dStore[] = new Double[10];
		GenQueue<Double> q2 = new GenQueue<Double>(dStore);
		Double dVal;
		
		System.out.println("Demonstrate a queue of Integers.");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Adding " + (double) i/2 + " to q2.");
				q2.put((double)i/2); // add integer value to q
			}
		} catch (QueueFullException exc) {
			System.out.println(exc);
		}
		
		try {
			for (int i = 0; i < 0; i++) {
				System.out.println("Getting next Integerfrom q: ");
				dVal = q2.get();
				System.out.println(dVal);
			}
		} catch (QueueEmptyException exc) {
			System.out.println(exc);
		}
		}

}
