package ex03;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//(Test)
		//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		Scanner sc = new Scanner(System. in);
		System.out.println("문제1. 정수입력>>");
		int num = sc.nextInt();
		
		if (num > 50)
			System.out.println("50 이상");
		else
			System.out.println("50 이하");
		
		sc.nextLine();
		System.out.println("----------------------------------------------------------");

		
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		System.out.println("문제2. 정수입력>>");
		num = sc.nextInt();
		if (num % 3 ==0)
			System.out.println("3의 배수");
		else
			System.out. println("3의 배수아님");
		
		System.out.println("----------------------------------------------------------");
	
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
			System.out.println("(경고) 0이상 100이하의 점수만 입력하세요!");
		else
			System.out.println("불합격!!");
	
		System.out.println("----------------------------------------------------------");

//		문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
		System.out.println("문제4. 세 개의 정수 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max, min =0;
		int sum = a + b + c;
		int average = sum / 2;
		
		//max 구하기
		if(a>b && c<a)
			max = a;
		else if(a<b && c<b)
			max =b;
		else
			max =c;
		
		//min 구하기
		if(a<b && c>a)
			min = a;
		else if(a>b && c>b)
			min =b;
		else
			min =c;
		
		System.out.printf("=> (세 개의 정수 %d %d %d)의 최대값은 %d, 최소값은 %d, 합계는 %d, 평균은 %d 이다.%n", a, b, c, max, min, sum, average);
		
		System.out.println("----------------------------------------------------------");
		
//		문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
		System.out.println("문제5. 정수 입력>>");
		num = sc.nextInt();

		if(num >= 0)
			System.out.println("양수");
		else
			System.out.println("음수");
		
		sc.nextLine();
		System.out.println("----------------------------------------------------------");

//		문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
		System.out.println("문제6. 문자열 입력>>");
		String str = sc.nextLine();
		
		System.out.println("입력한 문자열: " + str);
		
		char ch = str.charAt(0);
		System.out.println("첫 번째 문자: " + ch);
		
		if(ch >= 'a' && ch <= 'z')
			System.out.println("첫번째 문자는 소문자");
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println("첫번째 문자는 대문자");
		else
			System.out.println("영문자만 입력하세요!");

		System.out.println("----------------------------------------------------------");

//		문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램작성
//		(90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F)	
		System.out.println("문제7. 세 개의 정수 입력>>");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int sum2 = i + j + k;
		int average2 = sum2 / 3;

		System.out.println("총점: " + sum2 + ", 평균: " + average2);

		if(average2 >= 90 && average2 <= 100)
			System.out.println("학점: A");
		else if(average2 >= 80 && average2 < 90)
			System.out.println("학점: B");
		else if(average2 >= 70 && average2 < 80)
			System.out.println("학점: C");
		else if(average2 >= 60 && average2 < 70)
			System.out.println("학점: D");
		else if(average2 >= 0 && average2 < 60)
			System.out.println("학점: F");
		else
			System.out.println("점수는 0이상 100이하만 가능!");
		
		System.out.println("\n---------------------------------------------- 테스트 종료");
	}
	
}
