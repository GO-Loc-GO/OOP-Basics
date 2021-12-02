package oop_labs;

public class Car {
	 public final String Manufacturer;
	 public final String Model;
	 public final double MaxSpeed;
	 public static final int NumberOfWheels = 4;
	 private double CurrentSpeed = 0;
	 Car(String manufacturer, String model, double maxSpeed) {
	 this.Manufacturer = manufacturer;
	 this.Model = model;
	 if (maxSpeed < 0) {
	 System.out.println("Warning: Maximum Speed of a Car cannot be Negative!");
	 }
	 this.MaxSpeed = maxSpeed;
	 }
	 public static void printNumberOfWheelsInCar() {
	 System.out.print("Number of wheels in a car = ");
	 System.out.println(NumberOfWheels);
	 }
	 //we need a getter method to access the value of the variable CurrentSpeed
	 //because it's otherwise a private variable.
	 public double getCurrentSpeed() {
	 return this.CurrentSpeed;
	 }
	 //we need a setter method to set the value of the variable CurrentSpeed
	 //because it's otherwise a private variable. Also, we can perform checks
	 //before setting up the value of CurrentSpeed just like we did for maxSpeed
	 //in the constructor.
	 public void setCurrentSpeed(double speed) {
	 if (speed < 0) {
	 System.out.println("Warning: Current Speed of a Car cannot be Negative!");
	 }
	 this.CurrentSpeed = speed;
	 }
}
