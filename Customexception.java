package Wiley_java;
class Agenotvalid extends Exception{
	public Agenotvalid(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		return "this age is not valid";
		
	}
	@Override
	public String toString() {
		return "age not applicable";
		
	}
	
}

public class Customexception {
	
	public static void getAge(int age) throws Agenotvalid{
		if(age > 18) {
			try {
				throw new Agenotvalid("Age not valid");
//				throw new Exception("age not valid");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else{
			System.out.println("Age valid");
		}
	}
	public static void main(String[] args) throws Agenotvalid {
		// TODO Auto-generated method stub
		getAge(21);
	}

}
