package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		int num = 8;
		int cnt = 3;
		
		System.out.println(num / cnt); // (몫)2
		System.out.println(num % cnt); // (나머지)2
		
		System.out.println("--------------------------");
		
		// (TEST)
		// 키보드로 4000을 입력받는다.. 4000초
		// 화면 상 출력
		// 1시간 6분 40초
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 초를 입력 >>");
		int input = sc.nextInt();
		
		int seconds = input % 60;
		int hours = input / 3600; //60*60
		int minutes = (input % 3600) / 60;
		
		System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");
	}

}
