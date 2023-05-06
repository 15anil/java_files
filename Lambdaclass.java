package lambda;

public class Lambdaclass {
	static void printThing(Printable thing) {
		
		thing.print("Edge", "wiley");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product myproduct = new Product();
//		printThing(null);
		Printable lambdaprinciple = (p,s) -> System.out.println(s + p);
		printThing(lambdaprinciple);
//		System.out.println(lambdaprinciple);

	}

}
