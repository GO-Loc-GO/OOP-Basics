package oop_Lecture3_ObjectsClassesnMethods_samples;

public class Date {
	int day;
	int month;
	int year;
	public Date(int d,int m,int y) {
	  if(d>0 && m>0 && y>0) {
      day = d;
	  month = m;
	  year = y;
	  }
	  else {
		  System.out.println("Invalid vlaue among day,month and year.");
	  }
	}
	void incrementYear() {
		year++;
	}
	void incrementMonth() {
		if(month < 12) {
			month++;
		}else{
			month=1;
			incrementYear();
		}
	}
}