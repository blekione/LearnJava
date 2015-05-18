package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {
	String helpfile; // name of help file
	
	Help(String fname) {
		helpfile = fname;
	}
	
	boolean helpOn(String what) {
		int ch;
		String topic, info;
		
		// Open the help file.
		try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
		{
			do {
				// read characters until a # is found
				ch = helpRdr.read();
				
				// now see if topics match
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) { // found topic
						do {
							info =  helpRdr.readLine();
							if (info != null) System.out.println(info);
						} while (info != null && (info.compareTo("") != 0));
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException exc) {
			System.out.println("I/O Exception: " + exc);
			return false;
		}
		return false;
	}
	
	// Get a Help topic
	String getSelection() {
		String topic = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter topic: ");
		try 
		{
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Error reading console");
		}
		return topic;
	}
}


public class FileHelp {

	public static void main(String[] args) {
		Help hlpobj = new Help("helpfile.txt");
		String topic;
		
		System.out.println("Try the help system." + "Enter 'stop' to end");
		
		do {
			topic = hlpobj.getSelection();
			if (!hlpobj.helpOn(topic))
				System.out.println("Topic not found");
		} while (topic.compareTo("stop") != 0);
	}
}
