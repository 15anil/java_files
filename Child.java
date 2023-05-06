package lambda;

public interface Child extends Parent {
	public void sayHello();
	
	default void sayHi() {
		
	}
	

}
