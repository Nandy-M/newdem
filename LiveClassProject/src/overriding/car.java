package overriding;

public class car extends vehicle{

	car() {
		System.out.println("Car object: " + this);
	}
	
	String fuel() {
		return "Diesel";
	}
}
