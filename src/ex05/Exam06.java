package ex05;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// (Test)
		// 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		// 만일 문자열이 "12345"라면, "1+2+3+4+5" 결과인 15를 출력해야 한다
		// [Hint] String charAt(int i) 클래스 사용
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) { //문자열'0' == 숫자48, 문자열'1' == 숫자49, 문자열'2' == 숫자50 (아스키코드)
			char tmp = str.charAt(i);
			int num = (tmp -'0');
			// i가 0일때, str.charAt(i)는 tmp=문자열 첫번째자리(='1')
			// ==> int num = int('1'-'0');
			// ==> int num = int(49 - 48);
			// ==> int num = 1; 
			// ==> i=0일때 stirng 1번째, 문자열'1'을 출력하기 위해 49-48=1 (i<5일때까지 계속 반복)
			sum += num; // == 문자열1 + 문자열2 + ... (i<5일때까지 계속 반복)
			
//			sum += str.charAt(i) - '0'; // ==> sum += '1' - '0' ==> 49 - 48 == 1
		}
		System.out.println("sum= " + sum);
	}

}
