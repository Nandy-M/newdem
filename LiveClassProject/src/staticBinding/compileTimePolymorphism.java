package staticBinding;

public class compileTimePolymorphism {

	public static void main(String[] args) {
		compileTimePolymorphism ob=new compileTimePolymorphism();
		ob.add(2,3);
		ob.add(2.3f,3.2f);

	}
	void add(int a,int b)
	{
		int result=a+b;
		System.out.println(result);
	}
	void add(float a,float b)
	{
		float result=a+b;
		System.out.println(result);
	}

}
