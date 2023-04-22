package Wiley_java;
class Vehicle{
	public void tier(){
		System.out.println("tier");
	}
	public void steering() {
		System.out.println("steering");
	}
	public void airbag() {
		System.out.println("airbags");
	}
}
class Smartcar extends Vehicle{
	public void sensor() {
		System.out.println("sensor");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Smartcar s = new Smartcar();
		s.airbag();
		s.sensor();
		s.tier();
		s.steering();

	}

}
