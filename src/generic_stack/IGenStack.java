package generic_stack;

// A generic stack interface

public interface IGenStack<T> {
	
	
	void push(T obj) throws StackFullException;
	// push object on the end of the stack
	// throws StackFullException if stack is full
	
	T pop() throws StackEmptyException;
	// pop last object from end of the stack
	// throws StackEmptyException if stack is empty
}
