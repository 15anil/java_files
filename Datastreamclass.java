package Day3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Datastreamclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout = new FileOutputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data2.txt");
//		DataOutputStream dos = new DataOutputStream(fout);
//		
//		dos.writeBytes("I am a programmer");
//		dos.flush();
//		dos.close();
//		
		FileInputStream fin = new FileInputStream("C:\\Users\\245an\\eclipse-workspace\\SampleApp\\src\\Wiley\\data2.txt");
		DataInputStream din = new DataInputStream(fin);
		int count = fin.available();
		byte[] ba = new byte[count];
		din.read(ba);
		for(byte b : ba) {
			System.out.println((char)b);
		}
		din.close();
		fin.close();

	}

}
