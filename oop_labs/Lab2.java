package oop_labs;

import java.util.Scanner;

public class Lab2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		int X=0,Y=0;
        if(scanner.hasNextInt()){
            X = scanner.nextInt();
        }else {
        	System.out.println("False input !");
        	System.exit(1);
        }
        System.out.println("Please enter an operator among '+', '-', '*' and '/': ");
        char O =scanner.next().charAt(0);
        if(O=='*'||O=='/'||O=='+'||O=='-') {
        	System.out.println("Please enter another integer number: ");
        	if(scanner.hasNextInt()){
                Y = scanner.nextInt();
            }else {
            	System.out.println("False input !");
            	System.exit(1);
            }
        }else {
        	System.out.println("False input !");
        	System.exit(1);
        }
        int output=0;
        if(O=='*'){
        output = X*Y;
        }else if(O=='/'){
        	output=X/Y;
        }else if(O=='+') {
        	output=X+Y;
        }else if(O=='-') {
        	output=X-Y;
        }
        System.out.printf("The result is: %d",output);
        scanner.close();

	}
}
