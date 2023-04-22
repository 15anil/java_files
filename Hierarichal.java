package Wiley_java;
class Vehicle1{
	public void steering() {
		System.out.println("steering");
	}
}
class car1 extends Vehicle1{
	public void airbag() {
		System.out.println("airbag is present");
	}
}
class Truck extends Vehicle1{
	public void Hydraulicpump(){
		System.out.println("hydraulic pump");
	}
}

public class Hierarichal {

	public static void main(String[] args) {
		car1 c = new car1();
		c.airbag();
		Truck t = new Truck();
		t.Hydraulicpump();

	}

}
