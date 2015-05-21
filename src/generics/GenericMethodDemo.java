// Demonstrate a simple generic method to check if 2 arrays are equal
package generics;

public class GenericMethodDemo {
	
	// Determine if the content of two arrays are the same
	static <T extends Comparable<T>, V extends T> boolean
		arraysEqual(T[] x, V[] y) {
		// If array length differ, then the arrays differ
		if (x.length != y.length) return false;
		
		for (int i = 0; i < x.length; i++)
			if (!x[i].equals(y[i])) return false;
		return true;
	}

	public static void main(String[] args) {
		Integer nums[] = { 1, 2, 3, 4, 5 };
		Integer nums1[] = { 1, 2, 3, 4, 5 };
		Integer nums2[] = { 1, 2, 7, 4, 5 };
		Integer nums3[] = { 1, 2, 3, 4, 5, 6 };
		
		if (arraysEqual(nums, nums1))
			System.out.println("nums equal nums1");
		
		if (arraysEqual(nums, nums2))
			System.out.println("nums equal nums2");
		
		if (arraysEqual(nums, nums3))
			System.out.println("nums equal nums3");
		
		// Create arrays of Doubles
		Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		//if (arraysEqual(nums, dvals))
			//System.out.println("nums equal dvals");
	}

}
