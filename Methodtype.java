package Wiley_java;
class test{
	public static int add1(int a,int b) {
		int val = a+b;
		return val;
	}
}

public class Methodtype {
	public void sub(int a,int b) {
		int val = a-b;
		System.out.println("subtraction in instance method " + val);
	}
	public void add(int a,int b) {
		int val = a+b;
		System.out.println("Adiition in instance method " + val);
		this.sub(25, 9);
	}
	public static int mul(int a,int b) {
		int mul = a*b;
		return mul;
	}

	public static void main(String[] args) {
		Methodtype m = new Methodtype();
		int mult =mul(25,25);
		System.out.println(mult);
		m.add(25, 25);
		System.out.println("test class called is  " + test.add1(2, 3));

	}

}
