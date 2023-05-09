package ex23_1;
//stream
//- InputStream(), FileInputStream()

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile { 

	public static void main(String[] args) throws IOException {

//		String path = "c:\\data\\data.dat";
		String path = "c:/data/data.dat";
		
	/*	InputStream input = new FileInputStream(path);
		int data = input.read();
		input.close();
		System.out.println(data);
		System.out.printf("%c", data);
		System.out.println();
		System.out.printf("%d : %c", data, data); //아스키코드표
	*/
		
		InputStream in = new FileInputStream(path);
		byte[] data = new byte[1024];
		int byteRead = 0; //읽어올 글자수
		String str = null;
		
		while( (byteRead = in.read(data)) != -1) { //데이터를 더이상 읽을수 없을떄까지(-1)
			str = new String(data, 0, byteRead);
			System.out.println("byte: " + byteRead);
		}
		System.out.println(str);
		in.close();
		
	}

}
