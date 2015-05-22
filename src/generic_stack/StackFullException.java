package generic_stack;

public class StackFullException extends Exception{
	
	int size;
	
	public StackFullException(int s) {
		size = s;
	}
	
	@Override
	public String toString() {
		return "\nStack is full. Maximum size is " + size; 
	}

}
