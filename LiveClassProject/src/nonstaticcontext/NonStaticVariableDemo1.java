package nonstaticcontext;

public class NonStaticVariableDemo1 {

	int num;//instance variable or non static variable
	static
	{
		System.out.println("Inside static block");
	}

	{
		System.out.println("Inside non static block");//instance block or non static block
	}
	NonStaticVariableDemo1(int x)
	{
		System.out.println("Inside a constructor");//constructor
		this.num=x;
		
	}
	public static void main(String[] args) {
		System.out.println("Inside main method");
		NonStaticVariableDemo1 nsvd= new NonStaticVariableDemo1(20);
		NonStaticVariableDemo1 nsvd2= new NonStaticVariableDemo1(21);
		NonStaticVariableDemo1 nsvd3= new NonStaticVariableDemo1(22);
		System.out.println(nsvd.num);
		System.out.println(nsvd2.num);
		System.out.println(nsvd3.num);
		

	}

}
