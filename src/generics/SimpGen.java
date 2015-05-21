package generics;

// A simple generic class with two types parameters: T and V
class TwoGen<T, V> {
	T ob1;
	V ob2;
	
	// Pass the constructor references to objects of type T and V
	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	// Show types of T and V
	void showTypes() {
		System.out.println("Type of T is: " + ob1.getClass().getName());
		System.out.println("Type of V is: " + ob2.getClass().getName());
	}
	
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
} 

public class SimpGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> tgOb = new TwoGen<Integer, String>(88, "Generics");

		// Show the types
		tgOb.showTypes();
		
		// Obtain and show values
		int v = tgOb.getob1();
		System.out.println("value: " + v);
		
		String str = tgOb.getob2();
		System.out.println("value: " + str);
	}

}
