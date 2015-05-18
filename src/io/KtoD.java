// A simple key-to-disk utility that demonstrates a FileWriter
package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KtoD {

	public static void main(String[] args) {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text ('stop' to quit).");
		try (FileWriter fw = new FileWriter("TestFile")) {
			do {
				System.out.print(": ");
				str = br.readLine();
				
				if (str.equals("stop")) break;
				
				str = str + "\r\n";
				fw.write(str);
			} while (!str.equals("stop"));
		} catch (IOException exc) {
			System.out.println("I/O Exception: " + exc);
		}
	}

}
