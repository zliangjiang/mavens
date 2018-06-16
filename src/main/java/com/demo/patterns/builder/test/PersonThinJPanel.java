package com.demo.patterns.builder.test;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PersonThinJPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK); 
		g.drawOval(50, 20, 30, 30);
		g.drawRect(60, 50, 10, 50);
		g.drawLine(60, 50, 40, 100);
		g.drawLine(70, 50, 90, 100);
		g.drawLine(60, 100, 45, 150);
		g.drawLine(70, 100, 85, 150);
	}
}
