package liveClass;

public class stringmethod {

	public static void main(String[] args) {
		String s="Hello world";
		System.out.println(s);
		System.out.println("length of string = "+s.length());
		System.out.println("Index of w = "+s.indexOf('w'));
		System.out.println("Character at 6 = "+s.charAt(6));
		System.out.println("Index of l = " +s.indexOf('l'));
		System.out.println("Index of second l = "+s.indexOf('l',3));//3 means searching l from 3rd index
		System.out.println("substring = "+s.substring(1));
		System.out.println("substring = "+s.substring(1,7));
		
		String[] s2=s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		String[] s3=s.split("o");
		System.out.println("No of derived words:"+s3.length);
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		System.out.println("index of space: "+s.indexOf(" "));
		System.out.println("Replaced: "+s.replace("l", "j"));
		System.out.println("uppercase: "+s.toLowerCase());
		System.out.println("Lowercase: "+s.toUpperCase());
		
		
		

	}

}
