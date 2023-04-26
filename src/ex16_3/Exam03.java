package ex16_3;
//BufferedWriter/FileWriter (파일쓰기), 텍스트파일에 문자열 데이터를 쓰기
//내pc > 로컬디스크 > data(폴더이름) > sample.txt(텍스트파일이름)을 data.txt로 변경해서 내용복사

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam03 {

	public static void main(String[] args) throws IOException {

		
		String filePath = "C:/data/sample.txt"; //읽어올 파일 경로
		BufferedReader reader = null;
		
		String fileNewPath = "C:/data/data.txt"; //읽어올 새로운 파일 경로
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			writer = new BufferedWriter(new FileWriter(fileNewPath));

			while((line = reader.readLine()) != null) {
				System.out.println(line);
				writer.write(line);
				writer.newLine(); //줄바꿈! (.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 줄바꿈해주어야함)
//				위의 두문장을 한문장으로도 사용가능:
//			 	writer.write(line + "\r\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//파일에서 읽기를 모두 끝마치면, "close()"메서드로 파일 리소스 사용을 정리해줘야함 (오류 방지):
			reader.close();
//			writer.flush();   //남아있는 데이터를 모두 출력시킴
			writer.close();
		}
	} 

}
