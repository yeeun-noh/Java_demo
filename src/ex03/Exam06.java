package ex03;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		//(Test)
		// 정수 하나를 입력받아서 1학년, 2학년, 3학년, 4학년 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 학년 입력(숫자만 입력) >>");
		int grade = sc.nextInt();
		
		switch(grade) {
			case 1:
				System.out.println("당신은 1학년");
				break;
			case 2:
				System.out.println("당신은 2학년");
				break;
			case 3:
				System.out.println("당신은 3학년");
				break;
			case 4:
				System.out.println("당신은 4학년");
				break;
			default:
				System.out.println("1-4만 입력.....");
				break;	
		}
		
		System.out.println("프로그램 종료");
	}

}
