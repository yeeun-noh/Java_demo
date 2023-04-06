package ex02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//(Test)
		// 성별, 나이 => 성별:남자, 나이: 20이상이면 군대간다..아니면 면제
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();

		sc.nextLine(); //엔터 제거 가능
		System.out.println("성별 입력 ('남' 혹은 '여' 만 입력가능)>>");
		String sex = sc.nextLine();
				
		if(sex.equals("남")) { // 문자열 비교는 == 사용하지 않고, equals() 메서드 사용
			if(age >= 20) {
				System.out.println("군대가야함");
			}else {
				System.out.println("군대면제!");					
			}
		}else {
			System.out.println("군대면제!");	
		}
		
		System.out.println("프로그램 종료");	
	}

}
