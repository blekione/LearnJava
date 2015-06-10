// demonstrate use of push button and handle action events
package swing_exm;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonDemo implements ActionListener {
	
	JLabel jlab;
	
	public ButtonDemo() {
		// create a new JFrame container
		JFrame jfr = new JFrame("A button example");
		
		// specify FlowLayout for the layout manager
		jfr.setLayout(new FlowLayout());
		
		// give a frame initial size
		jfr.setSize(220, 90);
		
		// terminate the program when the user closes the application
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// make two buttons
		JButton jbtnUp = new JButton("Up");
		JButton jbtnDown = new JButton("Down");
		
		// add action listeners
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);
		
		
		// add the buttons to the content pane
		jfr.add(jbtnUp);
		jfr.add(jbtnDown);
		
		// create a label
		jlab = new JLabel("Press a button");
		
		// add the label to content pane
		jfr.add(jlab);
		
		// display the frame
		jfr.setVisible(true);
	}
	
	// handle button events
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Up"))
			jlab.setText("You pressed Up.");
		else
			jlab.setText("You pressed Down.");
	}

	public static void main(String[] args) {
		// create the frame on the event dispatchin thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}

}
