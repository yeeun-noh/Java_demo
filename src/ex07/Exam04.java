package ex07;

import java.util.Arrays;

public class Exam04 {
	
	public static void main(String[] args) {
		//커맨드 라인을 통해 입력받기
		// Run> Run Configurations> Arguments> Program arguments칸에 1,2,or 3 입력+비교 해보기: 
		if(args[0].equals("1"))
				System.out.println("--------------");
		else if(args[0].equals("2")) 
				System.out.println("++++++++++++++");
		else if(args[0].equals("3"))
				System.out.println("**************");
	}
}
