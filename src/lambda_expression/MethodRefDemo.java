// Demonstrate a method reference for a static method

package lambda_expression;

@FunctionalInterface
interface IntPredicate {
	boolean test(int n);
}

// This class defines three static methods that check an integer
// against some condition.
class MyPredicates {
	// A static method that returns true if a number is prime
	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i < n/i; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	// A static method that returns true if a number is even
	static boolean isEven(int n) {
		return (n % 2) == 0;
	}
	
	// A static method that returns if a number is positive
	static boolean isPositive(int n) {
		return n > 0;
	}
}

public class MethodRefDemo {

	// This method has functional interface type of its first parameter.
	// Thus, it can be passed a reference to any instance of that interface,
	// including one created by a method reference.
	static boolean numTest(IntPredicate p, int v) {
		return p.test(v);
	}
	
	public static void main(String[] args) {
		boolean result;
		
		// Here, a method reference to isPrime is passed to numTest
		result = numTest(MyPredicates::isPrime, 17);
		if(result) System.out.println("17 is prime.");
		
		// A method reference to isEven
		result = numTest(MyPredicates::isEven, 12);
		if(result) System.out.println("12 is even.");
		
		
		// A method reference to isPositive
		result = numTest(MyPredicates::isPositive, 11);
		if(result) System.out.println("11 is positive.");
		
		
	}

}
