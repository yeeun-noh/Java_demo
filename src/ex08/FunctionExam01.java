package ex08;

/*
 * 입력 === (함수) ===> 출력
 * 
 * void main() { => void: return값이 없음   
 * }
 * 
 * ex) String main(int num) {  => main이라는 함수안에 int 매개변수 하나를 입력받아 string을 출력(반환)
 * 			return "문자열";
 * 	   }
 * 
 * void:변환타입,  main:함수명,  ():매개변수 타입
 * {}:함수가 수행문장
 */


// 1. 더하기 : 반환타입O, 매개변수O
// 2. 실수값을 전달하면, 실수값을 정수로 변환해서 돌려주느 시스템
public class FunctionExam01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = add(10, 20); // 10,20 은 "인자(argument)"
		
		int num2 = convertInt(10.2);
		
		System.out.println(num + " , " + num2);
		System.out.println("프로그램 끝!");
	}
	
//	- 매개변수(parameter)는 실제로 값이 존재하지는 않고, "어떤 형태로 입력값이 들어올것인지"를 정의
//	- 인자(argument)는 매개변수에 대입되는 "실제로 메모리에 할당"되어 있는 변수
	
	//1. 더하기 : 반환타입O, 매개변수O
	static int add(int n1, int n2) { // n1,n2는 "매개변수(parameter)"
		System.out.println("add함수 시작...");
		int result = n1 + n2; // n1,n2,result는 "지역변수(local variable)"
		return result;
	}
	
	//2. 실수값을 전달하면, 실수값을 정수로 변환해서 돌려주느 시스템
	static int convertInt(double d) {
		int result = (int)d;
		return result;
	}
	
}

/* (실행결과:)

프로그램 시작
add함수 시작...
30 , 10
프로그램 끝!

 */
