// An exception for gueue-full errors

package generic_queue;

public class QueueFullException extends Exception{
	
	int size;
	
	QueueFullException(int s) {
		size = s;
	}
	@Override
	public String toString() {
		return "\nQueue is full. Maximum size is " + size;
	}

}
