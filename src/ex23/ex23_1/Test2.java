package ex23_1;
//1~100까지 파일로 저장하는 프로그램
//- Writer(), FileWriter()

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {

	public static void main(String[] args) throws IOException {
		String path = "c:/data/number.dat";
		
		Writer out = new FileWriter(path);		
		
		for(int i=0; i<100; i++) {
			String data = Integer.toString(i);
			out.write(data);
		}
		System.out.println("파일을 정상적으로 저장했습니다");
		out.close();
	}

}
