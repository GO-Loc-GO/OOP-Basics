package oop_labs;

import java.lang.Math;

public class Circle {
	double Radius;
	public Circle(double radius) {
		if (radius <= 0) {
			System.out.println("ERROR: Radius of circle must be +ve!");
			System.exit(0); 
		}else {
			Radius = radius; 
		} 
	}
	public double getPerimeter() {
		return 2 * Math.PI * Radius; 
	}
	
	public double getArea() {
		return Math.PI * Radius * Radius; 
	}
}
