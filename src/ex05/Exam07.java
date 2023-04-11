package ex05;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// (Test) Exam06.java와 비교해보기
		// int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		// 만일 변수 num의 값이 12345라면, "1+2+3+4+5" 결과인 15를 출력해야 한다
		// [주의] 문자열로 변환하지 말고 숫자로만 처리해야한다

		int num = 12345;
		int sum = 0;

		while(num>0) {
			sum += num%10;	//5 (1234.5의 소수점자리출력)
			num /= 10;		//1234 (1234.5의 정수자리출력)
//			(계속반복:)
//			sum += num%10;	//4
//			num /= 10;		//123
//			sum += num%10;	//3
//			num /= 10;		//12
//			sum += num%10;	//1
//			num /= 10;		//1
//			sum += num%10;	//0 (필요X)
//			num /= 10;		//0 (필요X)
		}
		
		System.out.println("sum= " + sum);	
	}

}
