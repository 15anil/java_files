package Wiley_java;

public class Varscope {
	int ins = 20;
	static String name = "Anil";
	int val1 = 12;
	int val2 = 13;
	public void sum() {
		int val1 = 10;
		int val2 = 20;
		System.out.println("addition is : " + (this.val1+this.val2));
		System.out.println("addition without instance class memebers is " + (val1+val2));
	}

	public static void main(String[] args) {
		int loc = 10;
		Varscope var = new Varscope();
		System.out.println("local variable " + loc);
		System.out.println("instance variable " + var.ins);
		System.out.println("name is  " + name);
		var.sum();
		

	}

}
