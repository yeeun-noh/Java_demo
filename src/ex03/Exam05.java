package ex03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계절 입력>>");
		String season = sc.nextLine();
		
		switch(season) { // 정수랑 문자열만 가능
			case "spring" :
				System.out.println("봄이다.");
				break;
			case "summer" :
				System.out.println("여름이다.");
				break;
			case "fall" :
				System.out.println("가을이다.");
				break;
			case "winter" :
				System.out.println("겨울이다.");
				break;
			default :
				System.out.println("계절만 입력.");
		}
		
		System.out.println("프로그램 종료");
	}

}
