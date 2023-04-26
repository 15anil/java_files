package Day3;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		
		String ss = "Wiley";
		
		System.out.println(ss.equals(sb1.toString()));
		System.out.println(sb);
		
		System.out.println(sb);
		sb.insert(2, "a");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(5, 9));
	}

}
