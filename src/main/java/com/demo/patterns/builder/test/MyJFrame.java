package com.demo.patterns.builder.test;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	private static final long serialVersionUID = 8602497104378613509L;
	PersonThinJPanel personThinJPanel = null;
	PersonFatJPanel personFatJPanel = null;
	
	public MyJFrame(){
		personThinJPanel = new PersonThinJPanel();
		this.add(personThinJPanel);
		personFatJPanel = new PersonFatJPanel();
		this.add(personFatJPanel);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);  
	}
}
