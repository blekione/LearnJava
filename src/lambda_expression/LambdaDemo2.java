// Use the same functional interface with three different lambda expressions
package lambda_expression;

@FunctionalInterface
interface NumericTest {
	boolean test(int n, int m);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		// This lambda expression determines if one is a factor of another
		NumericTest isFactor = (n,d) -> n % d == 0;
		if (isFactor.test(10, 2))
			System.out.println("2 is a factor of 10");
		if (!isFactor.test(10, 3))
			System.out.println("3 is not a factor of 10");
		System.out.println();
		
		
		// This lambda expression returns true if the first argument is 
		// less than the second.
		NumericTest isLess = (n,d) -> (n < d);
		if(isLess.test(2, 10))
			System.out.println("2 is less than 10.");
		if (!isLess.test(10, 2))
			System.out.println("10 is not less than 2.");
		
		// This lambda expression returns true 
		// if the absolute values of the arguments are equal
		NumericTest absEqual = (n,d) -> (n < 0 ? -n : n) == (d < 0 ? -d : d);	
		
		if (absEqual.test(4, -4))
			System.out.println("Absolute values of 4 and -4 are equal.");
		if (!absEqual.test(4, -5))
			System.out.println("Absolute values of 4 and -5 are not equal.");
		System.out.println();
	}

}
