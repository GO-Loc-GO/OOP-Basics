package oop_labs;

public class Lab9 {

	public static void main(String[] args) {
		 // Create New Rectangle
		 Rectangle myRectangle = new Rectangle(4.5, 2);
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
		 
		 // Create New Circle
		 Circle myCircle = new Circle(5);
		 System.out.print("Perimeter of the created circle is = ");
		 System.out.println(myCircle.getPerimeter());
		 System.out.print("Area of the created circle is = ");
		 System.out.println(myCircle.getArea());
		 }

	}

