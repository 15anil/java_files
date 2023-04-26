package Day3;

import java.util.Arrays;

import java.util.*;
public class Stringformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> techstack =Arrays.asList(
				"essential java",
				"head first java",
				"java design patterns"
				);
		for(String book : techstack) {
			System.out.format("%10s - In stock%n",book);
		}

	}

}
