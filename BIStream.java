package Day3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BIStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data1.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i ;
		while((i=bis.read())!=-1) {
			System.out.println((char)i);
		}
		bis.close();
		fis.close();
		

	}

}
