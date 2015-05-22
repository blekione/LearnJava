// A generic queue interface

package generic_queue;

public interface IGenQ<T> {

	// Put an item into the queue
	void put(T obj) throws QueueFullException;
	
	// Get an item from the queue
	T get() throws QueueEmptyException;
	
}
