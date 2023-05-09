package ex23_1;
//Buffer => 두장치 사이의 속도차이를 처리하기 위한 공간 (Buffer에 저장해서 쌓아놓고, 한번에 데이터파일에 저장!, 속도 더 빠름(입출력 효율 높임))
// - 

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;

public class WriteBufferFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.dat";
		String message = "Hello, Java";
		
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));		
		byte[] data = message.getBytes(); //문자열 저장시
		out.write(data);
		System.out.println("파일을 정상적으로 저장했습니다");
		out.close();
		System.out.println("------------------------");
		
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));
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
