package staticcontext;

public class StaticVariablesDemo {

    static int num;
	
	public static void main(String[] args) {
		System.out.println("Static Variable value = " + StaticVariablesDemo.num);
		//don't need to create object ,we can directly "access static variable" using class name inside static method
	}

}
