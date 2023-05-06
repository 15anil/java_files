package lambda;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Binaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> n = a -> a^1;
		System.out.println(n.apply(0));
		
		BinaryOperator<Integer> n1 = (a,b) -> a & b;
		System.out.println(n1.apply(1, 5));
		
		HashMap<Integer,String> employee = new HashMap<>();
		employee.put(0, "anil");
		employee.put(2, "steve");

		employee.put(1, "janavi");
		for(Entry<Integer, String> val: employee.entrySet()) {
			System.out.println(val);
		}
		for(Integer k : employee.keySet()) {
			System.out.println(k);
		}
		for(String v : employee.values()) {
			System.out.println(v);
		}


	}

}
