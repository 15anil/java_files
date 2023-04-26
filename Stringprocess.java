package Day3;

public class Stringprocess {

	public static void main(String[] args) {
		String s1 = "Wiley";
		String s2 = "Wiley";
//		System.out.println(s1 == s2);
//		
//		
//		String s3 = new String("Wiley");
//		System.out.println(s2 == s3);
//		String s4 = new String("Wiley");
//		System.out.println(s3 == s4);
		
		String str = " i am a java developer";
		String str2 = "python developer";
		String str3 = str.concat(" " + "and a " + str2);
		
//		System.out.println(str.length());
//		System.out.println(str.charAt(10));
//		System.out.println(str3);
//		System.out.println(str.replace("java","python"));
//	
		
		String st[] = str.split(" ");
		
		for(String string : st ) {
			System.out.println(string);
		}
		String fname = "anil";
		String mname = "ravi";
		String lname = "nemani";
		
		System.out.println(fname.concat(" " + mname).concat(" " + lname));
	}

}
