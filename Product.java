package lambda;

public class Product implements Printable{
	public String name;
	public int id;
	
	public Product() {}
	
	public void print() {
		
	}

	@Override
	public void print(String prefix, String suffix) {
		// TODO Auto-generated method stub
		System.out.println("this is a product class that implements interface");
		
	}

}
