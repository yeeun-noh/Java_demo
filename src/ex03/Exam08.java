package ex03;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		//(Test)
		// 컴퓨터와 가위바위보 게임.....
		
		int com = (int)(Math.random() *3) +1; //1.0 ~ 3.0;

		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력 >>");
		int user = sc.nextInt();
		
		System.out.println("User: " + user + "\nCom: "+ com);
		switch(user-com) {
			case 0:
				System.out.println("-> 결과: 비김");
				break;
			case -2: case 1:
				System.out.println("-> 결과: User 승!");
				break;
			case 2: case -1:
				System.out.println("-> 결과: Com 승!");
				break;
		}
		
		System.out.println("프로그램 종료");
	}

}
