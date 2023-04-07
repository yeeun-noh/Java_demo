package ex03;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		
		//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		Scanner sc = new Scanner(System. in);
		System.out.println("문제1. 정수입력>>");
		int num = sc.nextInt();
		
		if (num>50)
			System.out.println("50 이상");
		else
			System.out.println("50 이하");
		
		sc.nextLine();
		System.out.println("-----------------------------");

		
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		System.out.println("문제2. 정수입력>>");
		num = sc.nextInt();
		if (num % 3 ==0)
			System.out.println("3의 배수");
		else
			System.out. println("3의 배수아님");
		
		System.out.println("-----------------------------");
	
//		문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
//		4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//		이를 판단하는 프로그램을 작성해보자.
//		점수가 0미만 100초과이면 경고문구 출력!
		System.out.println("문제3. 학년입력>>");
		int grade = sc.nextInt();
		
		System.out.println("      점수입력>>");
		int score = sc.nextInt();
		
		if(grade == 4 && score >=70)
				System.out.println("4학년 합격!");
		else if(grade < 4 && score >=60)
			System.out.println("그외 학년 합격!");
		else if(score <0 || score > 100)
			System.out.println("(경고) 0이상 100이하의 점수만 입력하세요.");
		else
			System.out.println("불합격!!");
	
		System.out.println("-----------------------------");

	}
	
}
