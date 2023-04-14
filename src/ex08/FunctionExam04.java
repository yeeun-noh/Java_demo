package ex08;

// 1. 더하기 : 반환타입X, 매개변수X
// 2. 호출함수에게 실수값을 전달하면, 호출함수에서 정수로 변환해서 출력 - 입력과 출력이 모두 없는 메소드 
public class FunctionExam04 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add();
		convertInt();
		
		System.out.println("프로그램 끝!");
	}
	
	//1. 더하기 : 반환타입X, 매개변수X
	static void add() {
		int i = 10;
		int i2 = 20;
		System.out.println("더하기: " + (i+i2));
	}
	
	// 2. 호출함수에게 실수값을 전달하면, 호출함수에서 정수로 변환해서 출력 - 입력과 출력이 모두 없는 메소드 
	static void convertInt() {
		double d = 10.9;
		System.out.println("정수로 변환: " + (int)d);
	}
	
		

}

/* (실행결과:)

프로그램 시작
더하기: 30
정수로 변환: 10
프로그램 끝!

 */
