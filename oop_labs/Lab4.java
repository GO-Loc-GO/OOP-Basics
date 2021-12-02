package oop_labs;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(5);
		Circle b = new Circle(2);
		float Aa=(float)a.getArea();
		float Ab=(float)b.getArea();
		float Ca=(float) a.getPerimeter();
		float Cb=(float) b.getPerimeter();
        System.out.println(Aa);
        System.out.println(Ab);
        System.out.println(Ca);
        System.out.println(Cb);
        
        Rectangle c = new Rectangle(10,5);
        Rectangle d = new Rectangle(6,6);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(d.getArea());
        System.out.println(d.getPerimeter());
	}

}

