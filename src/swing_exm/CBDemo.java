// Demonstrates check boxes

package swing_exm;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CBDemo implements ItemListener {

	JLabel jlabSelected;
	JLabel jlabChanged;
	JCheckBox jcbAlpha;
	JCheckBox jcbBeta;
	JCheckBox jcbGamma;
	
	// create new JFrame container
	CBDemo() {
		JFrame jfr = new JFrame("Demonstrate CHeck Boxes");
		
		jfr.setLayout(new FlowLayout());
		jfr.setSize(280, 120);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlabSelected = new JLabel("");
		jlabChanged = new JLabel("");
		
		jcbAlpha = new JCheckBox("Alpha");
		jcbBeta = new JCheckBox("Beta");
		jcbGamma = new JCheckBox("Gamma");
		
		jcbAlpha.addItemListener(this);
		jcbBeta.addItemListener(this);
		jcbGamma.addItemListener(this);
		
		jfr.add(jcbAlpha);
		jfr.add(jcbBeta);
		jfr.add(jcbGamma);
		jfr.add(jlabChanged);
		jfr.add(jlabSelected);
		
		jfr.setVisible(true);
	}
	
	// this is a event handler for the check boxes
	@Override
	public void itemStateChanged(ItemEvent e) {
		StringBuffer str = new StringBuffer("");
		
		// obtain a reference to a check box that cause the event
		JCheckBox cb = (JCheckBox) e.getItem();
		
		// report what check box changed
		if (cb.isSelected())
			jlabChanged.setText(cb.getText() + " was just selected.");
		else
			jlabChanged.setText(cb.getText() + " was just cleared.");
		
		// report all selected boxes
		if (jcbAlpha.isSelected()) 
			str.append("Alpha ");
		if (jcbBeta.isSelected())
			str.append("Beta ");
		if (jcbGamma.isSelected())
			str.append("Gamma");
		
		jlabSelected.setText("Selected check boxes: " + str);			
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CBDemo();
			}
		});
	}

}
