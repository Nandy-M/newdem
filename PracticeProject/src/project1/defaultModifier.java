package project1;
class defAccess
{
	// default
	void message() {
		System.out.println("Here! we are using default access specifier");
	}
}

public class defaultModifier {

	public static void main(String[] args) {

		System.out.println("Default Access Specifier");
		defAccess o = new defAccess(); // creating object for default defaccess class
		o.message(); // using the object,we are calling message method within the package.

	}
}
