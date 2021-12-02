package oop_Lecture3_ObjectsClassesnMethods_samples;

import java.util.Scanner;

public class CreatingAndUsingDate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pls enter a day month and year:");
		Date today = new Date(in.nextInt(10),in.nextInt(10),in.nextInt(10));
		today.incrementMonth();
        today.incrementYear();
        System.out.println(today.year + "." + today.month + "." + today.day);
        in.close();
	}

}
