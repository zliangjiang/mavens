package com.demo.patterns.builder.test.applet;

import java.awt.*;
import java.applet.*;

public class DrawLine extends Applet{
	
	private static final long serialVersionUID = 9049275725593146124L;

	public void paint(Graphics g){
		//从点(0,0)到点(400,400)之间画直线
	    g.drawLine(0,0,400,400);
	    //从点(0,400)到点(400,0)之间画直线
	    g.drawLine(0,400,400,0);
	}           
}
