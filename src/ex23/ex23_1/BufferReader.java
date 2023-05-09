package ex23_1;
//Buffer => 두장치 사이의 속도차이를 처리하기 위한 공간 (Buffer에 저장해서 쌓아놓고, 한번에 데이터파일에 저장!, 속도 더 빠름(입출력 효율 높임))
// - 

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/number3.txt";
		
		BufferedReader buffer = new BufferedReader(new FileReader(path));
		
		String line;
		
		while((line=buffer.readLine()) != null) {
			System.out.println(line);
		}
		buffer.close();
	}

}
