/*
 * Copy a text file
 * 
 * java CopyFile FIRST.TXT SECOND.TXT
 */
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFIle {
	public static void main (String args[]) {
		int i;
		
		// First make sure that both files has been specified
		if (args.length != 2) {
			System.out.println("Usage: CopyFile from to");
			return;
		}
		
		// Copy a file
		try (FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1])) 
			{			
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		} 
	}
}
