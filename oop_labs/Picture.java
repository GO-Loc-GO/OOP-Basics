package oop_labs;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Picture extends JComponent{
	protected void paintComponent(Graphics g){
		g.drawOval(100, 10, 10, 10);
		
	}

}
