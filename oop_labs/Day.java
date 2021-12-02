package oop_labs;

public enum Day {
	 MONDAY,
	 TUESDAY,
	 WEDNESDAY,
	 THURSDAY,
	 FRIDAY,
	 SATURDAY,
	 SUNDAY;
	 public boolean isWeekday() {
	 return this != SATURDAY && this != SUNDAY;
	 }
}
