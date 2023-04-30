package ex16_2;
//예외처리 (exception handling)
//try-catch문

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
	
	private static void printLength(String data) {
		int result = 0;
		
		try {
			result = data.length();
		} catch(NullPointerException e) {
			System.out.println(e);
			System.out.println(e.toString());	//.toString() : 화면에 예외메세지(이유)를 출력
			System.out.println(e.getMessage()); 	//.getMessage() : 화면에 예외메세지(이유)를 출력
			e.printStackTrace();			//.printStackTrace() : 위의 코드보다 더 디테일하게 출력
		}
		
		System.out.println("문자 수: " + result);
	}

}

/* (실행 결과:)

[프로그램 시작]
문자 수: 10
java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
Cannot invoke "String.length()" because "data" is null
java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
	at ex16_2.Exam01.printLength(Exam01.java:18)
	at ex16_2.Exam01.main(Exam01.java:10)
문자 수: 0
[프로그램 종료]

*/
