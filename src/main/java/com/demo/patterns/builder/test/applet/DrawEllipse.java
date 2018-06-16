package com.demo.patterns.builder.test.applet;

import java.awt.*;
import java.applet.*;

public class DrawEllipse extends Applet
{
	private static final long serialVersionUID = 1585359486216998584L;

	public void paint(Graphics g)
       {
              //在原点为(10,10)，半径为50画圆
              g.drawOval(10,10,50,50);
              //在原点为(100,10)，半径为50画填充效果的圆
              g.fillOval(100,10,50,50);
              //在原点为(190,10),长轴为75,短轴为50画的椭圆
              g.drawOval(190,10,90,30);
              //在原点为(70,90),长轴为140,短轴为100画填充效果的椭圆
              g.fillOval(70,90,140,100);           
       }
}
