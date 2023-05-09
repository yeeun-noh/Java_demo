package ex23_1;
//stream
//- OutputStream(), FileOutputStream()

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

//		String path = "c:\\data\\data.dat";
		String path = "c:/data/data.dat";
		String message = "Hello, Java";
		
		OutputStream out = new FileOutputStream(path);
		byte[] data = message.getBytes(); //문자열 저장시
		out.write(data);
//		out.write('A');	 //한문자
		System.out.println("파일을 정상적으로 저장했습니다");
		out.close();
	}

}