package liveClass;

public class conditions {
	public static void main(String[] args)
	{
       boolean isAlien = false;
		
		if (isAlien) {
			System.out.println("It is an alien");
		}
		
		if (!isAlien) {
			System.out.println("it is not an alien");
		}
		
		String name = "max";
		if (name == "max") {
			System.out.println("correct name");
		}
		
		boolean x = true;
		boolean y = true;
		
		if (x && y) {
			System.out.println("Both the conditions are true");
		} else if (x) {
			System.out.println("Only x is true");
		} else {
			System.out.println("only y is true");
		}
		
		System.out.println("");
		
		int a = 10;
		int b = 5;
		int c = 20;
		
//		System.out.println("a < b = " + (a<b));
//		System.out.println("a < b and a < c = " + (a<b && a<c));  // logical AND
//		System.out.println("a < b and a < c = " + (a<b & a<c));   // bitwise AND
	
		System.out.println("a < b and a < c = " + (a<b && ++a<c));  // logical AND
		System.out.println("A after logical and = " + a);
		System.out.println("a < b and a < c = " + (a<b & ++a<c));  // bitwise AND
		System.out.println("A after bitwise and = " + a);
		
		System.out.println("");
		
		// == comparison
		// = assignment
		
		boolean mybool = false;
		if (mybool=true) {
			System.out.println("X");
		} else {
			System.out.println("Y");
		}
		
		System.out.println("what will be the value ? " + (mybool=false));
		
	}

}
