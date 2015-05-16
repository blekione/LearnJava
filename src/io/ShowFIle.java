/*
 * Display a text file
 * To use this program specify the name of the file
 * that you want to see. 
 * For example, to see a fill called TEST.TXT use
 * use the following command line
 * 
 * java ShowFile TEST.TXT
 */
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFIle {

	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		//First make sure that a file has been specified
		if(args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}

		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found");
			return;
		}


		try {
			// read bytes until EOF is encountered
			do {
				i = fin.read();
				if (i != -1) System.out.print((char)i); 
			} while (i != -1);
		}catch (IOException exc) {
			System.out.println("Error reading file");
		} finally {
			// Close the file on the way out of the try block
			try {
				fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing file.");
			}
		}
	}

}
