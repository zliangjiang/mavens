package com.demo.patterns.builder.test.applet;

import java.awt.*;
import java.applet.*;

public class Draw3DRect extends Applet {

	private static final long serialVersionUID = 2594166957624300411L;

	public void paint(Graphics g){
            //设置亮灰色颜色，主要是3D效果在此颜色比较清楚地看出来
           g.setColor(Color.lightGray);
           g.draw3DRect(20,20,100,160,true);
           g.draw3DRect(200,20,100,160,false);
     }
}
