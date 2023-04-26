package Day3;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder logMessage = new StringBuilder();
		
		long timestamp = System.currentTimeMillis();
		
		logMessage.append("[").append(timestamp).append("]");
		
		int userid = 12345;
		logMessage.append("user").append(userid).append(":");
		
		String msg = "Login successfully";

		System.out.println(logMessage.toString());
		
	}

}
