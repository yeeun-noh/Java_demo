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
	}
	
}
