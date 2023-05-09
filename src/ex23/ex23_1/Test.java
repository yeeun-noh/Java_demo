package ex23_1;
//1~100까지 파일로 저장하는 프로그램

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		String path = "c:/data/data.dat";
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream(path));		
		
		for(int i=0; i<100; i++)
			out.writeInt(i);
		System.out.println("파일을 정상적으로 저장했습니다");
		out.close();
	}

}
