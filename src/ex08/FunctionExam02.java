package ex08;

// 1. 더하기 : 반환타입O, 매개변수O (2개)
// 2. 실수값을 전달하면, 실수값을 정수로 변환해서 출력하는 함수 작성 - 입력은 있고 출력은 없는 메소드
public class FunctionExam02 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add(10,20);
		
		convertInt(10.9);
		
		System.out.println("프로그램 끝!");
	}
	
	// 1. 더하기 : 반환타입O, 매개변수O (2개)
	static void add(int num1, int num2) { //void => return값 가지지 않음
		System.out.println("더하기: " + (num1+num2));
	}
	
	//2. 실수값을 전달하면, 실수값을 정수로 변환해서 출력하는 함수 작성 - 입력은 있고 출력은 없는 메소드
	static void convertInt(double d) {
		System.out.println("정수로 변환: " + (int)d);
	}

}

/* (실행결과:)

프로그램 시작
더하기: 30
정수로 변환: 10
프로그램 끝!

 */
