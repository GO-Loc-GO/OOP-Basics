package oop_labs;

public class Lab8 {

	public static void main(String[] args) {
		// Create New Rectangle
		 Rectangle myRectangle = new Rectangle(2, 2);
		 System.out.print("Perimeter of the created rectangle is = ");
		 System.out.println(myRectangle.getPerimeter());
		 System.out.print("Area of the created rectangle is = ");
		 System.out.println(myRectangle.getArea());
		 // Create New Triangle
		 Triangle myTriangle = new Triangle(4.5, 2, 3);
		 System.out.print("Perimeter of the created triangle is = ");
		 System.out.println(myTriangle.getPerimeter());
		 System.out.print("Area of the created triangle is = ");
		 System.out.println(myTriangle.getArea());
	}

}
