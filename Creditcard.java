package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Creditcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String card_number = "4520-2341-6789-9033";
		Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(card_number);
		
		String maskedcard = matcher.replaceAll("XXXX-XXXX-XXXX-");
		System.out.println(maskedcard);

	}

}
