// Use a method reference to an instance method

package lambda_expression;

@FunctionalInterface
interface IntPredictate2 {
	boolean test(int n);
}

// Class storing an int value and defines instance method isFactor(),
// which returns true if its argument is a factor of the stored value.

class MyIntNum {
	private int v;
	
	// Constructor
	MyIntNum(int x) { v = x;}
	
	int getNum() {return v; }
	
	// Return true if n is factor of v
	boolean isFactor(int n){
		return (v % n) == 0;
	}
}

public class MethodRefDemo2 {

	public static void main(String[] args) {
		boolean result;
		MyIntNum myNum1 = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);
		
		// Method reference to isFactor on MyNUm is created
		IntPredicate ip =  myNum1::isFactor;
		
		// now it is used to call isFactor() via test()
		result = ip.test(3);
		if (result) System.out.println("3 is a factor of " + myNum1.getNum());
		
		ip = myNum2::isFactor;
		
		result = ip.test(3);
		if (!result) System.out.println("3 is not a factor of " + myNum2.getNum());
	}

}
