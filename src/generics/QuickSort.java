package generics;

public class QuickSort<T extends Comparable<T>> {
	
	private T[] getPivot(T[] a, int left, int right) {
		int pivotIndex;
		int m = (right - left) / 2; // m is about halfway between left and right
		// calculating median from a[left] a[m] and a[right]
		pivotIndex = getMedian(a, left, m, right);
		if (pivotIndex != left) {
			T temp = a[left];
			a[left] = a[pivotIndex];
			a[pivotIndex] = temp;
		}
		return a;

	}

	public int getMedian(T[] arr, int a, int b, int c) {
		System.out.println(arr[a] + " " + arr[b] + " " + arr[c]);
		if ((arr[a].compareTo(arr[b]) <= 0) && (arr[a].compareTo(arr[c]) >= 0) ||
				(arr[a].compareTo(arr[b]) >= 0) && (arr[a].compareTo(arr[c]) <= 0)) // a is a median value
			return a;
		else if ((arr[b].compareTo(arr[a]) <= 0) && (arr[b].compareTo(arr[c]) >= 0) ||
				(arr[b].compareTo(arr[a]) >= 0) && (arr[b].compareTo(arr[c]) <= 0)) // b is a median value
			return b;
		else
			return c;
	}
	
	public T[] quickSort( T[] a, int left, int right) {
		if(left < right) {
			System.out.println("\nrecursive quick sort, left: " + left + ", right: " + right);
			getPivot(a, left, right); // a[left] is now a pivot
			T pivot = a[left]; 
			int pivotIndex = left;
			for (int i = left; i <= right; i++){
				if (a[i].compareTo(pivot) < 0) {
					T temp = a[pivotIndex];
					a[pivotIndex] = a[i];
					a[i] = a[pivotIndex + 1];
					a[pivotIndex + 1] = temp;
					pivotIndex++;
				}
			}
			//for (T i : a)
			//	System.out.print(i + " ");
			quickSort(a, left, pivotIndex-1);
			quickSort(a, pivotIndex+1, right);
		}
		return a;
	}
}
