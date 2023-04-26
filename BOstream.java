package Day3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOstream {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data1.txt");
		BufferedOutputStream bof = new BufferedOutputStream(fout);
		String str = " hello world ";
		byte[] b = str.getBytes();
		try {
			bof.write(b);
			bof.flush();
			bof.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
