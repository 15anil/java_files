package Wiley_java;
import java.util.*;


public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,3,5};
		String str = "anil";
		try {
			System.out.println(array[1]);
			System.out.println(array[4]);
			System.out.println("simple statement 2");
			System.out.println(str.charAt(5));
			System.out.println(12/0);
			
			System.out.println("simple statement ");
			System.out.println("simple statement ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}catch(IndexOutOfBoundsException e) {
			System.out.println("catch block 2");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("catch block 3");
			e.printStackTrace();
		}
		System.out.println("another statement");

	}

}
