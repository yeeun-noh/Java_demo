package ex16_3;
//Exam01 변형:
//try-with-resources문 + '입출력(I/O)' 관련 예시: 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {

		String filePath = "C:/data/sample.txt"; //읽어올 파일 경로
		
		//try-with-resources믄 괄호()안에 객체를 생성하는 문장을 넣으면,
		//이 객체는 따로 close()를 호출하지 않아도 try문장을 벗어나는 순간 자동적으로 close()가 호출됨,
		//그 다음에 catch블럭 또는 finally블럭이 수행됨:
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
