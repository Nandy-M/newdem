package exception;

import java.util.Scanner;

public class nullPointerDemo {

	public static void main(String[] args) {

		try
		{
			String s = null;
		    System.out.println("String Length: " + s.length());
		
		} catch (NullPointerException e) {
			System.out.println("error occurred");
		}
		
	
	}

}
