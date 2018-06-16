package com.demo.patterns.builder.test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PersonFatJPanel extends JPanel{

	private static final long serialVersionUID = -5963914674499704718L;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED); 
		g.drawOval(50, 20, 30, 30);
		g.drawOval(45, 50, 40, 50);
		g.drawLine(50, 50, 30, 100);
		g.drawLine(80, 50, 100, 100);
		g.drawLine(60, 100, 45, 150);
		g.drawLine(70, 100, 85, 150);
	}
}
