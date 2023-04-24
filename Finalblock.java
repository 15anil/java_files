package Wiley_java;

public class Finalblock {
	public static void main(String[] args) {
		try {
			System.out.println("11111");
			System.out.println(12 / 0);
			System.out.println("edge");
			System.exit(0);
			
		}catch (Exception e) {
			System.out.println("catch block exception caught");
			e.printStackTrace();
			
		} finally {
			try {
				System.out.println("try catch block inside finally");
				System.out.println(12/0);
			}catch (Exception ee) {
				ee.printStackTrace();
				System.out.println("nested exception caught");
				ee.printStackTrace();
			}

			System.out.println("clone connection");

		}

	}
}
