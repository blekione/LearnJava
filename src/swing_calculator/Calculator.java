// my GUI calculator
package swing_calculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator implements ItemListener, ActionListener{

	char buttonsLabels[] = {'7', '8', '9', '/', 'C', '4', '5', '6', '*', '(',
			'1', '2', '3', '-', ')', '0', '.', '^', '+', '=' };
	StringBuffer mathFormula = new StringBuffer("");
	
	public Calculator() {

		JFrame frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.Y_AXIS));
		

		JTextField displayField = new JTextField();
		Font font1 = new Font("SansSerif", Font.PLAIN, 20);
		displayField.setFont(font1);
		
		JPanel displayPane = new JPanel();
		displayPane.setLayout(new BorderLayout());
		displayPane.add(displayField);
		
		
		JPanel keyboardPane = new JPanel(new GridLayout(4, 5, 4, 4));		
		// creating number buttons from 0 - 10 and adding them to pane
		JButton calcButton;
		for (Character c : buttonsLabels) {
			calcButton = new JButton(c.toString());
			keyboardPane.add(calcButton);
		}
		
		mainPane.add(displayPane);
		mainPane.add(keyboardPane);
		
		frame.setContentPane(mainPane);
		frame.pack();
		frame.setVisible(true);		
	
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Calculator();
			}
		});
	}
	
}
