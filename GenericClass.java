//GenericClass

package Generics;

import java.util.ArrayList;

public class GenericClass {
	public static void main(String[] args) {
//		Printer<Cat> printer=new Printer(new Cat());
//		printer.print();
//		
//		Printer<Dog> printer1=new Printer(new Dog());
//		printer1.print();
//		
//		
//		ArrayList<Object> cats=new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());
//		
//		
//		shout("Tame me to movie");
//		shout("Bring necklace");
//		shout(200000000);
//		shout(new Dog());
	}
		
		private static <T,V> T shout(T shoutOut, V valtoBring) {
			System.out.println(shoutOut+"!!!:)");
			System.out.println(valtoBring + " !@@@!");
			
			return shoutOut;
		}
	}