package ex02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 성적 입력 받아서 70이상 합격했습니다..메시지 출력..
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수는? >>");

		int score = sc.nextInt();
		
		//조건문 ~if
		if(score >= 70)
			System.out.println("합격했습니다.");
		
		System.out.println("프로그램 종료");
		
		// 나이 입력 받아서 20세이상 성년..메시지 출력.. , 아니면 미성년
		System.out.println("\n당신의 나이는? >>");

		int age = sc.nextInt();
		
		//조건문 ~if~else
		if(age>=20)
			System.out.println("성년");
		else // 생략가능
			System.out.println("미성년");
	}

}
