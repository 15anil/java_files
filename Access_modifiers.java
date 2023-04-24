package Wiley_java;

public class Access_modifiers {

	public int publicVariable = 1;
	private int privateVariable = 2;
	protected int protectedVariable = 3;
	int defaultVariable = 4;

	public static void main(String[] args) {
		Access_modifiers example = new Access_modifiers();

		System.out.println("Public variable: " + example.publicVariable);

		System.out.println("Private variable: " + example.getPrivateVariable());

		System.out.println("Protected variable: " + example.getProtectedVariable());

		System.out.println("Default variable: " + example.defaultVariable);
	}

	private int getPrivateVariable() {
		return privateVariable;
	}

	protected int getProtectedVariable() {
		return protectedVariable;
	}
}
