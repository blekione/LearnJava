/* 
 * Demonstration of use bounded generic class
 * by specifying superclass which generic type argument is extending 
 */
package generics;

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
