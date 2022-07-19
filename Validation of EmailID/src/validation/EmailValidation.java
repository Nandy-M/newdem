package validation;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> email = new ArrayList<String>();
		email.add("nandhini@gmail.com");
		email.add("kavyashree@gmail.com");
		email.add("bala.bharathi@gmail.com");
		email.add("dharaneesh.siva@gmail.com");
		email.add("santhiya.sri@gmail.com");
		System.out.println("ENTER USER EMAIL ID:");
		String userId = s.nextLine();
		if (userId == null) {
			System.out.println("You didn't enter the emailID");
			return;
		}

		for (String i : email) // for(int i=0;i<email.size();i++)
		{
			if (email.contains(userId)) {
				System.out.println("\n");
				System.out.println("email ID " + userId + " found");
				break;
			} else {
				System.out.println("email ID " + userId + " Not found");
				break;

			}
		}
	}

}
