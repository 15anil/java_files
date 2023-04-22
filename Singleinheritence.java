package Wiley_java;
class Animal{
	public void eat() {
		System.out.println("EAT");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
class Lion extends Animal{
	public void roar() {
		System.out.println("roar");
	}
}

public class Singleinheritence {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.eat();
		l.sleep();
		l.roar();

	}

}
