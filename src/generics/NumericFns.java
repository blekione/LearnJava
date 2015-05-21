package generics;

//T type argument of generic class must be either Number
//or a class derived from Number
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
