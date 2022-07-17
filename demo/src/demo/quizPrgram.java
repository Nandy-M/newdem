package demo;

import java.util.Scanner;

public class quizPrgram {
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	  while(true)
	  {
		  System.out.println("Who is the actor of vikram?");
		  System.out.println("1.ajith\n2.vikram\n3.vijay\n4.kamal\n5.Exit");
		  System.out.println("Enter your choice(1/2/3/4/5):");
		  int n=s.nextInt();
		  if (n==4)
		  {
			  System.out.println("Congrats,you are right");
			  System.out.println();
			  break;
		  }
		  else if(n==5)
			  break;
	  
		  else
		  {
			  System.out.println("wrong answer,Try again");
			  System.out.println();
		  }
			
		  
	  } 
	 
  }
}
