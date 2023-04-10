package ex04;

public class Exam04 {

	public static void main(String[] args) {
		//(Test)
		// 3이상 4462 이하에서 짝수인 정수의 합
		
		int sum = 0;
		for(int i=1; i<5000; i++) {
			if(i >= 3 && i<= 4462 && i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("3이상 4462 이하에서 짝수인 정수의 합은 " + sum);
		
		System.out.println("---------------------------------------");
		
		int sum2 = 0;
		int j=1;
		
		for(; ;) { // 초기화, 조건식, 증감식 모두 생략 가능 => 조건식이 생략된 경우, 참으로 간주되어 무한 반복문이 됨
			if(sum2 >= 10) break; // 무한 반복문 없애기 위해 break문 사용!
			
			sum2 += j;
			System.out.println(sum2);
		}
		System.out.println("j의 값: " + j);
		
		System.out.println("---------------------------------------");
		
		int num3 = 0;
		
		for(int i=200; i<=100; i++) { // for문의 조건식이 거짓이면, 블럭 내의 문장들이 실행되지않고 for문을 벗어남
			num3 +=i;
		}
		System.out.println(num3); // num3 = 0
	}
	
}
