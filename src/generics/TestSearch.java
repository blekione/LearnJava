package generics;

import java.util.Random;

public class TestSearch {

	public static void main(String[] args) {
		QuickSort<Integer> test = new QuickSort<Integer>();
		
		Integer[] a = new Integer [100];
		Random rmd = new Random();
		for (int i = 0; i < 100; i++){
			a[i] = rmd.nextInt(100);
		}
		
		a = test.quickSort(a, 0, a.length-1);
		
		for (Integer i : a){
			System.out.print(i + " ");
		}
		QuickSort<String> test1 = new QuickSort<String>();
		String[] str = {"dog", "cat", "bat", "lion", "goat", "cow", "mouse", "fox", "wolf", "sneak", "rat", "ant", "pig", "horse" };
		str = test1.quickSort(str, 0, str.length-1);
		for (String i : str) {
			System.out.print(i + " ");
		}

	}

}
