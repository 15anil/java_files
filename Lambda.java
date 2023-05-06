package Streams;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printable lambda_expression = (p,s) -> {
			System.out.println("Meow " + s);
			return "Meow: ";
		};
		printThing(lambda_expression);


	}
	public static void printThing(Printable thing) {
		thing.print("!","@");
	}

}
