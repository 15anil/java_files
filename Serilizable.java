package Day4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serilizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1 = new Book1(108,"java");
		try {
			FileOutputStream fos = new FileOutputStream("books.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			System.out.println("task completed");
		}catch(Exception e) {
			System.out.println("exception caught");
			e.printStackTrace();
		}

	}

}
