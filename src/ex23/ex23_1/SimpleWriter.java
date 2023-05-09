package ex23_1;
// Writer(), FileWriter(), Reader(), FileReader()
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.io.Reader;


public class SimpleWriter {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/number2.txt";
		
		Writer writer = new FileWriter(path);
		writer.write(path, 3, 4); //3번째부터 4글자 => "data"
		writer.close();
		
		Reader reader = new FileReader(path);
		int ch;
		while(true) {
			ch = reader.read();
			if(ch== -1) break;
			System.out.println((char)ch);
		}
	}

}
