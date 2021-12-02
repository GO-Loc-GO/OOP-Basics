package oop_labs;

import javax.swing.JFrame;

public class Window{
	public static void main(String[] args){
		JFrame window = new JFrame();
		window.setSize(300,400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Picture pic = new Picture();
		window.add(pic);
		window.setVisible(true);
	}
}
