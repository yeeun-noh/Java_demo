package ex08;

// 1. 더하기 : 반환타입O, 매개변수X
// 2. 호출함수에게 실수값을 전달하면, 호출함수에서 정수로 변환해서 출력 - 입력은 없고 출력은 있는 메소드
public class FunctionExam03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = add();		
		System.out.println("더하기: " + num);
//		System.out.println("더하기: " + add()); ==> int 변수를 사용하지 않고 바로 사용가능!
		
		double num2 = convertInt();
		System.out.println("정수로 변환: " + (int)num2);
		
		System.out.println("프로그램 끝!");
	}
	
	//1. 더하기 : 반환타입O, 매개변수X
	static int add(){
		int i = 10 + 20;
		return i;
	}
	
	//2. 호출함수에게 실수값을 전달하면, 호출함수에서 정수로 변환해서 출력 - 입력은 없고 출력은 있는 메소드
	static double convertInt() {
		return 10.9;
	}
	

}

/* (실행결과:)

프로그램 시작
더하기: 30
정수로 변환: 10
프로그램 끝!

 */
