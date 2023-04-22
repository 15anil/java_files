package Wiley_java;
interface person{
	public void getrole();
}
interface student extends person{
	
}
class teacher implements person{
	public void getrole() {
		System.out.println("teaching");
	}
}
class classroom extends teacher implements student{
	public void getrole() {
		System.out.println("class room teaching");
	}
}

public class Diamondproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classroom c = new classroom();
		c.getrole();
		teacher t = new teacher();
		t.getrole();
	}

}
