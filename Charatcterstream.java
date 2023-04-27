package Day4;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class Charatcterstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer out = new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("C:\\\\Users\\\\245an\\\\eclipse-workspace\\\\SampleApp\\\\src\\\\Wiley\\\\data6.txt");
		Reader re = new InputStreamReader(null, "C:\\\\\\\\Users\\\\\\\\245an\\\\\\\\eclipse-workspace\\\\\\\\SampleApp\\\\\\\\src\\\\\\\\Wiley\\\\\\\\data6.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i like programming need to accept");
		bw.flush();
		bw.close();
		fw.close();
		
		
		

	}

}
