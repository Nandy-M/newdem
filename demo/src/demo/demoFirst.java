package demo;

import java.util.Scanner;

public class demoFirst {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER FIRST NO?");
		num1=s.nextInt();
		System.out.println("ENTER SECOND NO?");
		num2=s.nextInt();
		System.out.println("ADDITION OF TWO NUM="+(num1+num2));
		System.out.println("SUBTRACTION OF TWO NUM="+(num1-num2));
		System.out.println("MULTIPLICATION OF TWO NUM="+(num1*num2));
		System.out.println("DIVISION OF TWO NUM="+(num1/num2));
		

	}

}
