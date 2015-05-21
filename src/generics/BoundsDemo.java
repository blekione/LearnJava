/* 
 * Demonstration of use bounded generic class
 * by specifying superclass which generic type argument is extending 
 */
package generics;

// T type argument of generic class must be either Number
// or a class derived from Number
class NumericFns<T extends Number> {
	T num;
	
	// Pass the constructor a reference to a numeric object
	NumericFns(T n){
		num = n;
	}
	
	// Return the reciprocal
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	
	// Return the fractional component
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
}

public class BoundsDemo {
	public static void main(String args[]) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(5);
		
		System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
		System.out.println("Fraction component of iOb is " + iOb.fraction());
		
		NumericFns<Double> dOb = new NumericFns<Double>(5.25);
		
		System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
		System.out.println("Fraction component of dOb is " + dOb.fraction());
		
	}
}
