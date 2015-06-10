// use of text field
package swing_exm;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TFDemo implements ActionListener {
	
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;
	
	public TFDemo() {
		
		// create a new JFrame container
		JFrame jfr = new JFrame("Use a text field");
		jfr.setLayout(new FlowLayout());
		jfr.setSize(240, 120);
		
		// terminate the program when the user closes the application
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a text field
		jtf = new JTextField(10);
		
		// set the action command for the text field
		jtf.setActionCommand("myTF");
		
		// create the reverse button
		jbtnRev = new JButton("Reverse");
		
		// add action listeners
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);
		
		// create the labels
		jlabPrompt = new JLabel("Enter text:");
		jlabContents = new JLabel("");
		
		// add the components to the content pane
		jfr.add(jlabPrompt);
		jfr.add(jtf);
		jfr.add(jbtnRev);
		jfr.add(jlabContents);
		
		// display the frame
		jfr.setVisible(true);
	}	
	
	// handle action events
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getActionCommand().equals("Reverse")) {
			// the reverse button was pressed
			String orgStr = jtf.getText();
			String resStr = "";
			
			// reverse the string in the text field
			for (int i = orgStr.length()-1; i >= 0; i--) {
				resStr +=orgStr.charAt(i);
			}
			
			// store the reverse string in the text field
			jtf.setText(resStr);
		} else 
			// Enter was pressed when focus was in text file
			jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
	}
	
	public static void main(String[] args) {
		// create the frame on the event dispatching thread
		SwingUtilities.invokeLater(new Runnable()  {
			
			@Override
			public void run() {
				new TFDemo();
			}
		});
	}

	

}
