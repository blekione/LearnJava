// A functional interface that tests to strings

package lambda_expression;

@FunctionalInterface
interface StringTest {
	boolean test (String aStr, String bStr);
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		// This lambda expression determines if is a part of other
		
		StringTest myTest = (a, b) -> a.indexOf(b) != -1;
		
		String test = "This is a test";
		
		System.out.println("Testing string: " + test);
		
		if (myTest.test(test, "is a"))
			System.out.println("'is a' found.");
		else
			System.out.println("'is a' not found.");
		
		if (myTest.test(test, "xyz"))
			System.out.println("'xyz' found.");
		else
			System.out.println("'xyz' not found.");

	}

}
