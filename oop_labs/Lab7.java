package oop_labs;

public class Lab7 {

	public static void main(String[] args) {
		String[] shapes = {
				 "circle",
				 "triangle",
				 "square",
				 "rectangle"
				};
				for (int i = 0; i < shapes.length; i++) {
				 System.out.println(shapes[i]); 
				}
		// Given the Number of Sides
		int numberOfSides = 3;
		// Given the length of Each Side
		double[] sideLengths = { 2, 7, 3 };
		for (int i = 0; i < sideLengths.length; i++) {
			 System.out.println(sideLengths[i]);
		}
		Polygon mypolygon = new Polygon(numberOfSides, sideLengths);
		System.out.print("Perimeter of the created polygon is = ");
		System.out.println(mypolygon.getPerimeter());

	}

}
