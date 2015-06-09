// Pass parameter to an applet

//package applets;

import java.applet.*;
import java.awt.*;

/*
 <applet code="Param.class" width=300 height=80>
 <param name=author value="Marcin Kruglik">
 <param name=purpose value="Demonstrate Parameters">
 <param name=version value=2>
 </applet>
 */


public class Param extends Applet{
	String author;
	String purpose;
	int ver;
	
	public void start() {
		String temp;
		
		author = getParameter("author");
		if(author == null) author = "not found";
		
		purpose = getParameter("purpose");
		if(author == null) author = "not found";
		
		temp = getParameter("version");
		try {
			if(temp != null)
				ver = Integer.parseInt(temp);
			else
				ver = 0;
		} catch (NumberFormatException exc) {
			ver = -1; // error code
		}		
	}
	
	public void paint(Graphics g) {
		g.drawString("Purpose: " + purpose, 10, 20);
		g.drawString("By: " + author, 10, 40);
		g.drawString("Version: " + ver, 10, 60);		
	}
}
