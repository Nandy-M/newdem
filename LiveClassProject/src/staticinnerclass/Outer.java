package staticinnerclass;

public class Outer {
	
	static class Inner {
		static void f2() {
			System.out.println("Static Method: Inner.f2()");
		}
		
		void f3() {
			System.out.println("Non static method inside inner class: f3()");
		}
	}

	static void f1() {
		System.out.println("Static Method: Outer.f1()");
	}
	
	public static void main(String[] args) {
		Outer.f1();//do not create object for outer class.Because u calling outer class's static method f1 .
		
		Outer.Inner.f2();////do not create object for inner class.Because u calling inner class's static method f1 
		
		Outer.Inner inner = new Outer.Inner();
		inner.f3();//create object for inner class.Because u calling inner class's non static method
	}
}