package multiinterface;

public class MyCircle implements Circle2,circle {
	@Override
	public void calculateArea() {
		System.out.println(Circle2.pi);
	}

	@Override
	public void calculateArea(int radius) {
				
	}
}
