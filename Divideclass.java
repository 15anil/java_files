package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Divideclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^(\\d+) divide by (\\d+)$");
		Matcher matcher = pattern.matcher("10 divide by 5");
		if(matcher.find()) {
			String msg = "result = " + matcher.replaceFirst("$1/$2");
			System.out.println(msg);
			System.out.println(matcher.group(1));
			
			int res = Integer.valueOf(matcher.group(1));
			System.out.println(res);
		}
		

	}

}
