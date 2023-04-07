package ex03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//(Test)
		// 숫자 하나를 입력 받아서 2의 배수이면서 3의 배수이면
		// 2와 3의 배수입니다...출력
		// 아니면 2와 3의 배수가 아닙니다...출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력>>");
		int number = sc.nextInt();
		
		if(number %2 == 0 && number %3 == 0)
			System.out.println("2와 3의 배수입니다");
		else
			System.out.println("2와 3의 배수가 아닙니다");
		
		System.out.println("프로그램 종료");
	}
	
}
