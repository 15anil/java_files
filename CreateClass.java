package Wiley_java;

public class CreateClass implements Cloneable {
	int a = 10;
	public void add() {
		System.out.println("adding");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		CreateClass cc = new CreateClass();
		System.out.println(cc.a);
		cc.add();
		//this is object creation using newInstance class
		try {
			Class c = Class.forName("Wiley_java.CreateClass");
			CreateClass ci =  (CreateClass)c.newInstance();
			ci.add();
			System.out.println(ci);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//this si object creating using cloneable interface
		CreateClass objClone = (CreateClass) cc.clone();
		objClone.add();
		System.out.println("object clone : - "+ objClone);
	}

}
