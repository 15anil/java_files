package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String re = "\\w\\w\\w";
//		String text = "211";
		Pattern pattern = Pattern.compile("^[a|A]gent\s(\\d{3,4})$");
		Matcher mt = pattern.matcher("agent 0077");
//		
//		boolean found = mt.find();
//		
//		boolean match = mt.matches();
		if(mt.find()) {
			System.out.println("Group : " + mt.group());
			System.out.println("Group : " + mt.group(1));
		}
		
//		System.out.println("found :" + found);
//		System.out.println("matches :" + match);
	}

}
