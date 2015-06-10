// A simple Swing program
package swing_exm;

import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		
		// Create a new JFrame container
		JFrame jfrm = new JFrame("A simple Swing Application");
		
		// give the frame a initial size
		jfrm.setSize(275, 100);
		
		// terminate the program when the user closes the application
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a text-based label
		JLabel jlab = new JLabel(" Swing defines the modern Java GUI");
		
		// add the label to the content pane
		jfrm.add(jlab);
		
		// display the frame
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo();
			}
		});
	}

}
