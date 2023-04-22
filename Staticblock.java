package Wiley_java;

public class Staticblock {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	public Staticblock() {
		System.out.println("inside constructor block");
	}

	public static void main(String[] args) {
		new Staticblock();
	
		

	}

}
