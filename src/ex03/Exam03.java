package ex03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//(Test)
		// 숫자 하나를 입력 받아서 짝수 인지 홀수 인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력>>");
		int number = sc.nextInt();
		
		if(number %2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

		// 다른 방법 :
		if(number %2 != 0)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
		System.out.println("프로그램 종료");
	}

}
