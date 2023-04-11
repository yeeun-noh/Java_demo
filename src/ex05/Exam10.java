package ex05;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		// 랜덤함수 1~100사이 숫자를 가지고 있다
		// 유저가 컴퓨처 랜덤 숫자를 맞추는 게임...
		
		int com = (int)(Math.random()*100)+1; // 1~100
		int user = 0;	
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("정수 입력> ");
			user = sc.nextInt();
			count++;
			if(com == user) {
				System.out.println("정답입니다!");
				break;
			} else if(com > user) {
				System.out.println("입력하신 숫자는 com의 숫자보다 작습니다");
			} else if(com < user) {
				System.out.println("입력하신 숫자는 com의 숫자보다 큽니다");
			}
		}						
		System.out.println("맞춘 횟수: " + count);
		System.out.println("com: " + com + ", user: " + user);
	}

}
