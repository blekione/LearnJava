// Use build-in enumeration methods 

package enumerations;

public class EnumDemo2 {
	public static void main(String args[]) {
		Transport tp;
		
		System.out.println("Here are Transport all constants");
		// use values();
		Transport allTransport[] = Transport.values();
		for(Transport t : allTransport)
			System.out.println(t);
		
		System.out.println();
		
		// use valueOf()
		tp = Transport.valueOf("AIRPLANE");
		System.out.println("tp contains " + tp);
	}
}
