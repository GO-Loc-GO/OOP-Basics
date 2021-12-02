package oop_labs;

public class Polygon {
	int numberofSides;
	double[] lengthofSides;
	public Polygon(int ns, double[] ls) {
		if (ns < 3) {
			 System.out.println("Not enough sides for a Polygon!!!");
			 System.exit(0);
			 }else if (ls.length != ns) {
			 System.out.println("Inconsistency of variables!!!");
			 System.exit(0);
			 }
		numberofSides=ns;
		lengthofSides = new double[ns];
		double sum=0;
		int i,j;
		for(i = 0; i<ls.length;i++) {
			for(j=0; j<ls.length;j++) {
				if(j==i) {
					continue;
				}else{
					sum=sum+ls[i];
				}
			}
			if(ls[i]>=sum) {
				System.out.println("Invalid length of sides!!!");
				System.exit(0);
			}else{
				lengthofSides[i]=ls[i];
			}
		}
	}
	public double getPerimeter() {
		double perimeter=0;
		for(int i=0;i<this.lengthofSides.length;i++) {
			perimeter=perimeter+this.lengthofSides[i];
		}
		return perimeter;
}
}
