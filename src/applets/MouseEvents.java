// Demonstrate the mouse event handlers

package applets;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
 <applet code="MouseEvents" width=300 height=100>
 </applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0; 
	
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	// handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
	
	// handle mouse entered
	public void mouseEntered(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
	
	// handle mouse exited
	public void mouseExited(MouseEvent me) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}
	
	// handle button pressed
	public void mousePressed(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}
	
	// handle button released
	public void mouseReleased(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}
	
	// handle mouse dragged
	public void mouseDragged(MouseEvent me) {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}
	
	// handle mouse moved
	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mose at " + me.getX() + ", " + me.getY());
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}
