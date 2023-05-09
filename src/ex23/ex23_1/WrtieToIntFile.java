package ex23_1;
//stream
//- DataOutputStream() => 데이터를 합쳐서 가져올수 있음

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrtieToIntFile { 

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.dat";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));
		out.writeInt(35);
		out.writeDouble(3.14);
		out.close();
		
	}

}
