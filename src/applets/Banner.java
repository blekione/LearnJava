// This applet creates thread that scrolls the message 
// contained in msg right to left across the applet's window

package applets;

import java.applet.*;
import java.awt.*;

/*
 
 */

public class Banner extends Applet implements Runnable{
	String msg = " Java rules the web.";
	Thread t;
	boolean stopFlag;
	
	// Initialize t to null
	public void init() {
		t = null;
	}

	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	// Entry point for the thread that runs the banner.
	public void run() {
		// Redisplay banner
		for( ; ; ) {
			try {
				repaint();
				Thread.sleep(250);
				if(stopFlag)
					break;
			} catch (InterruptedException exc) {}
		}			
	}
	
	// Pause the banner.
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	// Display the banner.
	public void paint(Graphics g) {
		char ch;
		
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}
}
