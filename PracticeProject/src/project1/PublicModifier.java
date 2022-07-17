package project1;

public class PublicModifier {
	
	public static void main(String[] args) {
		
		System.out.println("This is public access modifier");
		ProtectedModifier obj=new ProtectedModifier();
		obj.message();
		//obj.display();
		
	}

}
