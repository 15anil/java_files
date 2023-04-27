package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = " the key to LEARN programming id practicing";
		Pattern p = Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		
		if(m.find()) {
			int start = m.start();
			int end = m.end();
			
			System.out.println(" found match from index " + start + " to " + (end-1));
		}
	}

}
