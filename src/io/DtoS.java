// A simple disk-to-screen utility that demonstrates a FileReader
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {

	public static void main(String[] args) {
		String str;
		// Create and use a FileReader wrapped in a BufferedReader
		try (BufferedReader br = new BufferedReader(new FileReader("TestFile"))) {
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException exc) {
			System.out.println("I/O Exception: " + exc);
		}
	}

}
