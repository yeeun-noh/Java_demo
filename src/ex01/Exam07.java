package ex01;

import java.util.Scanner;

	public class Exam07 {

		public static void main(String[] args) {
		//(Test)
		//키보드로 국어,영어,수학 점수를 입력 받아서 총점/평균을 출력하는 프로그램 작성:
			
			Scanner sc = new Scanner(System.in);

			int kor, eng, math, total;
			double average;

			System.out.println("국어 점수>>");
			kor = sc.nextInt(); 

			System.out.println("영어 점수>>");
			eng = sc.nextInt(); 

			System.out.println("수학 점수>>");
			math = sc.nextInt(); 
			
			total = kor + eng + math;
			average = total / 3.0;
			
			System.out.println("총점: " + total);
		//	System.out.println("평균: " + average);			
			System.out.printf("평균: %.2f%n", average);			
	}

}
