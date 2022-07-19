package singleinheritance;

public class singleInheritanceTest extends singleInheritance {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		 singleInheritance obj=new  singleInheritance ();
		 obj.m1();
		 System.out.println(obj.getClass());
		 System.out.println(obj.hashCode());
		 System.out.println(obj.toString());
		 singleInheritance obj2 = new singleInheritance();
		 System.out.println(obj2.toString());
		 

	}

}
