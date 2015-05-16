package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFIle {

	public static void main(String[] args) {
		try (FileOutputStream output = new FileOutputStream("TEST")) {
			output.write('A');
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

	}

}
