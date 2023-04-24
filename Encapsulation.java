package Wiley_java;
class Employee{
	private String name;
	private int age;
	public String getname() {
		return name;
		
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
}
class Employeeimpl{
	public void show(Employee emp){
		System.out.println("calling show method");
		System.out.println("Name : " + emp.getname() + "Age : " + emp.getage());
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		em.setname("Anil");
		em.setage(21);
		System.out.println("Name : " + em.getname() + "\nAge : " + em.getage());
	}

}
