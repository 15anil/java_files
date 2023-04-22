package Wiley_java;
class Father{
	public void role() {
		System.out.println("i am the father");
	}
}
class son1 extends Father{
	public void role1() {
		System.out.println("i am son");
	}
}
class daughter1 extends Father{
	public void role2() {
		System.out.println("i am daughter");
	}
}
class son2 extends son1{
	public void role3() {
		System.out.println("iam a son of son1 ");
	}
}
class son3 extends son2{
	public void role4() {
		System.out.println("iam son of son2 or grandson of son1 ");
	}
}

public class Allmix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daughter1 d1 = new daughter1();
		d1.role();
		d1.role2();
		son3 s3 = new son3();
		s3.role();
		s3.role1();
		s3.role3();
		s3.role4();

	}

}
