package ex16_3;
//BufferedReader/FileReader (파일읽기), 텍스트파일안에 있는 내용읽기
//내pc > 로컬디스크 > data(폴더이름) > sample.txt(텍스트파일이름) 안에 있는 내용 출력

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam01 {

	public static void main(String[] args) throws IOException {

		String filePath = "C:/data/sample.txt"; //읽어올 파일 경로
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//파일에서 읽기를 모두 끝마치면, "close()"메서드로 파일 리소스 사용을 정리해줘야함 (오류 방지):
			reader.close();
		}
	}

}
