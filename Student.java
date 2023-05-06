package streams_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
	public int id;
	public String name;
	public int problems_solved;
	public double grade;
	
	

	public Student(int id, String name, int problems_solved, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.problems_solved = problems_solved;
		this.grade = grade;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getProblems_solved() {
		return problems_solved;
	}



	public void setProblems_solved(int problems_solved) {
		this.problems_solved = problems_solved;
	}



	public double getGrade() {
		return grade;
	}



	public void setGrade(double grade) {
		this.grade = grade;
	}
	



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", problems_solved=" + problems_solved + ", grade=" + grade
				+ "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> my_students = new ArrayList<>();
		my_students.add(new Student(1,"Ross",20,7.5));
		my_students.add(new Student(2,"Joey",10,4.5));
		my_students.add(new Student(3,"Chandler",10,4.5));
		my_students.add(new Student(4,"Monica",40,10));
		my_students.add(new Student(5,"Rachel",35,9.5));
		my_students.add(new Student(6,"phoebe",12,5.5));
		//filtering students based on problems solved
		
		List<Student> filtered = my_students
				.stream()
				.filter(student -> student
				.getProblems_solved() > 15)
				.collect(Collectors.toList());
		
		filtered.forEach(n->System.out.println(n));
		
		//updating the grade
		filtered.forEach(student -> student.setGrade(student.getGrade() + 0.5));
		
		filtered.forEach(stu -> System.out.println("updated grades: " + stu));
		
//		List<Student> sorted = my_students.stream()
//	            .filter(student -> student.getProblems_solved() > 10)
//	            .sorted()
//	            .collect(Collectors.toList());
		
//		System.out.println("Top 5 students sorted list is : " + sorted);
	}

}
