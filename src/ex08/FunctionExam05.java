package ex08;

// 함수를 호출하면서 인자값 하나 전달(정수)하면, 함수는 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게 반환해서 출력:
public class FunctionExam05 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		int total = sumFunction(100);

		System.out.print("Total= " + total + " 은 ");
		if(total%2 ==0) System.out.println("짝수!");
		else System.out.println("홀수!");
		
		
		
		System.out.println("프로그램 끝!");
	}
	
	
	static int sumFunction(int num) {
		int result = 0;
		
		for(int i=1; i<=num; i++) {
			result += i;
		}
		
		return result;
	}
	
		

}

/* (실행결과:)

프로그램 시작
Total= 5050 은 짝수!
프로그램 끝!

 */
