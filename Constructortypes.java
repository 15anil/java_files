package Wiley_java;

public class Constructortypes {
	public Constructortypes(int a,int b) {
		System.out.println("2 args count: " + (a+b));
	}
	public Constructortypes(float a,int b) {
		this(2,7);
		System.out.println("2 args float count: " + (a+b));
	}
	public Constructortypes() {
		System.out.println("0 args constructor");
	}

	public static void main(String[] args) {
		Constructortypes ct = new Constructortypes();
		Constructortypes ctadd = new Constructortypes(2,3);
		Constructortypes ctadd1 = new Constructortypes(2.1f,3);

	}

}
