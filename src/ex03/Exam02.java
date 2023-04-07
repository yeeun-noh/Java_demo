package ex03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//(Test)
		// 숫자 하나를 입력 받아서 양수, 음수, zero로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력>>");
		int number = sc.nextInt();
		
		if(number > 0)
			System.out.println("양수");
		else if (number == 0)
			System.out.println("zero");
		else
			System.out.println("음수");

		System.out.println("프로그램 종료");	
	}

}
