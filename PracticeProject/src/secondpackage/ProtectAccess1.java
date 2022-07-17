package secondpackage;

import project1.ProtectedModifier;

public class ProtectAccess1 extends ProtectedModifier{
	public static void main(String[] args)
	{
		 ProtectAccess1 obj=new ProtectAccess1(); 
		 obj.display();//display method from project1 package
		 
	}

}


