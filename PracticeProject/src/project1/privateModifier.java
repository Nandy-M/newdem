package project1;
class privAccess
{
	private void message()
	{
		System.out.println("This is private access modifier");
	}
}

public class privateModifier {

	public static void main(String[] args) {
		System.out.println("Here,we are using private access modifier");
		privAccess o=new privAccess();
		//o.message();

	}

}
