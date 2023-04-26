package ex16_2;
//예외처리 (exception handling)
//try-catch문

public class Exam02 {

	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String"); //Class.forName() : 클래스의 이름 찾음
			System.out.println("java.lang.String 클래스가 존재함");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
	}

}

/* (실행 결과:)

java.lang.String 클래스가 존재함
프로그램 종료

*/
