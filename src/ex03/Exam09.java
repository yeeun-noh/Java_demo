package ex03;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//(Test)
		// 학점 구하기는 switch문으로 변경(Exam01.java 확인)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력>>");
		int number = sc.nextInt();
				
		switch(number / 10) {
			case 10: case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
				break;
		}

		System.out.println("프로그램 종료");
	}

}
