package nonstaticcontext;

public class NonStaticVariableDemo {
	int num;//instance variable or non static variable

	{
		System.out.println("Inside non static block");//instance block or non static block
	}
	NonStaticVariableDemo(int x)
	{
		System.out.println("Inside a constructor");//constructor
		this.num=x;
		
	}

	public static void main(String[] args) {
		System.out.println("Inside main method");
		NonStaticVariableDemo nsvd= new NonStaticVariableDemo(20);
		System.out.println(nsvd.num);
		
	}

}
