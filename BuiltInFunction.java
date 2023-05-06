package lambda;

import java.util.HashMap;
import java.util.function.Function;

public class BuiltInFunction {
	private static HashMap<Integer,String> employee = new HashMap<>();
	public static void add(String name,int ID) {
		if(!employee.containsKey(ID)) {
			employee.put(ID,name);
		}else {
			System.out.println("Employee already exists ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,String> get = (Integer ID) ->{
			if(employee.containsKey(ID))
				return employee.get(ID);
			else
				return "Invalid id";
		};
		add("anil",1011);
		add("steve",1012);
		add("janavi",1013);
		System.out.println("ID: 1011 , Name: " + get.apply(1011));

	}

}
