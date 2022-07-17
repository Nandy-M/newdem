package project1;

import java.util.Scanner;

public class arithmeticCalci {

	public static void main(String[] args) {
		int num1,num2,result=0,n;
		Scanner s=new Scanner(System.in);
	
		System.out.println("ARITHMETIC CALCULATOR");
		System.out.println("Press 1 to ADD");
		System.out.println("Press 2 to SUBTRACT");
		System.out.println("Press 3 to MULTIPLY");
		System.out.println("Press 4 to DIVIDE");
		System.out.println("Press 5 to MODULO");
		//System.out.println("Press 6 to EXIT");
		System.out.println();
		System.out.println("ENTER FIRST NO");
		num1=s.nextInt();
		System.out.println("ENTER SECOND NO");
		num2=s.nextInt();
		System.out.println("ENTER THE CHOICE");
		n=s.nextInt();
		
		if(n==1)
		{
			result=num1+num2;
			System.out.println("The Sum is "+result);
		}
		else if(n==2)
		{
			result=num1-num2;
			System.out.println("The Difference is "+result);
		}
		else if(n==3)
		{
			result=num1*num2;
			System.out.println("The Product is "+result);
		}
		else if(n==4)
		{
			result=num1/num2;
			System.out.println("The Quotient is "+result);
		}
		else if(n==5)
		{
			result=num1%num2;
			System.out.println("The Modulo is "+result);
		}
		else
		{
			System.out.println("Invalid");
		}
			
		
		
		
	}

}
