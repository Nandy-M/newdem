package liveClass;

public class string {

	public static void main(String[] args) {
		String name ="Nandhini Murugesan";//store the string in normal variable
		
		String s2=new String("something");
		
		char[] c= {'h','e','l','l','o'};
		String s3=new String(c);
		
		byte[] b= {65,66,67};
		String s4=new String(b);
		
		System.out.println("Name: " + name);
		System.out.println("Length of name: " +name.length());
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
