package nonstaticinnerclass;

public class Outer {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();//obj creation for calling outer class non static method
		
		Outer.Inner inner = outer.new Inner();
		inner.f2();//obj creation for calling inner class non static method
		
	}

	void f1() {
		System.out.println("Non-Static Method: Outer.f1()");
	}
	
	class Inner {
		void f2() {
			System.out.println("Non-static Inner class non-static method");
		}
	}

}
