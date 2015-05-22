// A generic class of bounded stack

package generic_stack;

public class GenStack<T> implements IGenStack<T>{

	private T[] stck;
	private int stackTopIndex;
	
	// Construct an empty stack given its size
	public GenStack(T[] stckArray) {
		this.stck = stckArray;
		this.stackTopIndex = 0;
	}
	
	// Construct stack from a stack
	public GenStack(T[] stckArray, GenStack<T> obj) {
		this.stackTopIndex = obj.stackTopIndex;
		this.stck = stckArray;
		try {
			if (stck.length < obj.stck.length)
				throw new StackFullException(stck.length);
		} catch (StackFullException exc) {
			System.out.println(exc);
		}
		// Copy elements
		for (int i = 0; i < stackTopIndex; i++) {
			stck[i] = obj.stck[i];
		}
	}
	
	// Construct a stack with initial values.
	GenStack(T[] stckArray, T[] a) {
		stck = stckArray;
		for(int i = 0; i < a.length; i++) {
			try {
				push(a[i]);
			}
			catch(StackFullException exc) {
				System.out.println(exc);
			}
		}
	}

	

	// Push object onto the stack
	@Override
	public void push(T obj) throws StackFullException {
	if (stackTopIndex == stck.length)
		throw new StackFullException(stck.length);
		stck[stackTopIndex] = obj;
		stackTopIndex++;
	}

	@Override
	// Pop an object from the stack
	public T pop() throws StackEmptyException{
		if (stackTopIndex == 0)
			throw new StackEmptyException();
		stackTopIndex--;
		return stck[stackTopIndex];
	}
	

}
