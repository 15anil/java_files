package Day3;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Stringtoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "we love java programming" ;
		StringTokenizer st = new StringTokenizer(input, ":");
		
		System.out.println(st.countTokens());
		System.out.println(st.nextElement());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
		String title = " java developer";
		float salary = 2000.39f;
		System.out.format("%s has %.3f usd salary",title,salary);

	}

}
