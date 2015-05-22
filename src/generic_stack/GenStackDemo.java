// Program to demonstrate generic stack GenStack use
package generic_stack;

public class GenStackDemo {

	public static void main(String[] args) {
		// Construct 10-element empty Integer stack

		Integer iStore[] = new Integer[10];
		GenStack<Integer> stk1 = new GenStack<>(iStore);

		// Construct stack from array
		String name[] = { "One", "Two", "Three" };
		String strStore[] = new String[3];
		GenStack<String> stk2 = new GenStack<String>(strStore, name);

		String str;
		int n;
		try {
			// Put some values into stk1.
			for(int i=0; i < 10; i++)
				stk1.push(i);
		} catch(StackFullException exc) {
			System.out.println(exc);
		}
		// Construct stack from another stack.
		String strStore2[] = new String[3];
		GenStack<String> stk3 =
				new GenStack<String>(strStore2, stk2);
		try {
			// Show the stacks.
			System.out.print("Contents of stk1: ");
			for(int i=0; i < 10; i++) {
				n = stk1.pop();
				System.out.print(n + " ");
			}
			System.out.println("\n");
			System.out.print("Contents of stk2: ");
			for(int i=0; i < 3; i++) {
				str = stk2.pop();
				System.out.print(str + " ");
			}
			System.out.println("\n");
			System.out.print("Contents of stk3: ");
			for(int i=0; i < 3; i++) {
				str = stk3.pop();
				System.out.print(str + " ");
			}
		} catch(StackEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();


	}

}
