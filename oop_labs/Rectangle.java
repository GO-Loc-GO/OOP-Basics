package oop_labs;

public class Rectangle extends Polygon implements Shape{
	double width,length;
	Rectangle(double wid,double leng){
		super(4, new double[] {leng, wid, leng, wid});
		this.length = leng;
		this.width = wid;
		if(wid==leng) {
			System.out.println("Woah! The created rectangle is a square.");
		}
	}
    public double getArea() {
    	return width*length;
    }
}
