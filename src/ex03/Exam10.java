package ex03;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		Scanner sc = new Scanner(System. in);
		System.out.println("정수입력1>>");
		int num = sc.nextInt();
		
		if (num>50)
			System.out.println("50 이상");
		else
			System.out.println("50 이하");
		
		sc.nextLine();
		
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		System.out.println("정수입력1>>");
		num = sc.nextInt();
		if (num % 3 ==0)
			System.out.println("3의 배수");
		else
			System.out. println("3의 배수 아니다.");
	}

}
