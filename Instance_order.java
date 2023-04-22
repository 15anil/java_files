package Wiley_java;

public class Instance_order {
	String name;
	int age;
	{
		name = "anil";
		age = 21;
		System.out.println("instance block");
	}
	public Instance_order() {
		System.out.println("name : " + name + " age: " + age);
		System.out.println("constructor block ");
	}
	public Instance_order(int a,int b) {
		System.out.println("constructor parametrized :" + (a+b));
	}
	

	public static void main(String[] args) {
		Instance_order ir = new Instance_order();
		
		new Instance_order(2,3);
		new Instance_order();
	}

}
