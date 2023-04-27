package Day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filestream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data5.txt");
		FileInputStream fin = new FileInputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data5.txt");
		String str = "wiley full stack";
		byte[] b = str.getBytes();
//		fout.write(b);
//		fout.flush();
//		fout.close();
		
		int i;
		while((i=fin.read())!=-1) {
			System.out.println((char)i);
		}
		fin.close();

	}

}
