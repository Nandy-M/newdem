package chaining;

public class Child {
	Child() {
		System.out.println("Child Constructor: No Args");
	}
	
	Child(int x) {
//		super(x);
		System.out.println("Child Constructor: One Arg");
	}
}
