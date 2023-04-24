package Wiley_java;

import java.util.ArrayList;
class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}

public class Unchecked {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
		students.add("venkat");
		students.add("anjali");
		students.add("anil");
		
		if(!students.contains("nemani")) {
			try {
				throw new StringNotFound("this string is not found");
			}catch(StringNotFound e) {
				e.printStackTrace();
			}
		}
		System.out.println("messageone");
		System.out.println("messagetwo");

	}

}
