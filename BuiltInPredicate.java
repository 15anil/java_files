package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BuiltInPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> checklength = (String str) -> str.length() == 4;
		
		List<String> fi = Arrays.asList("java","python","jira","react");
		fi.forEach(l->{
			if(checklength.test(l)) {
				System.out.println(l);
			}
		});

	}

}
