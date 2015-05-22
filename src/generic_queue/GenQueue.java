// A generic fixed-size queue class 

package generic_queue;

public class GenQueue<T> implements IGenQ<T> {
	
	private T q[];
	private int putLocation, getLocation; // the put and get indecies
	
	// Construct an empty queue with given array
	public GenQueue(T[] q) {
		this.q = q;
		putLocation = getLocation = 0;	
	}
	
	@Override
	// Put an item into the queue
	public void put(T obj) throws QueueFullException{
		if(putLocation == q.length) 
			throw new QueueFullException(q.length);
		q[putLocation++] = obj;
	}

	@Override
	public T get() throws QueueEmptyException {
		if (getLocation == putLocation)
			throw new QueueEmptyException();
		return q[getLocation++];
	}
	

}
