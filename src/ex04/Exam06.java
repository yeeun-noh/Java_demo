package ex04;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
// 	(Test) 프로그램 실행 + 종료
//	-------------------------------
//	1.예금 | 2.출금 | 3.잔고 | 4.종료
//	-------------------------------
//	선택>1
//	예금액>10000
//		
//	-------------------------------
//	1.예금 | 2.출금 | 3.잔고 | 4.종료
//	-------------------------------
//	선택>2
//	출금액>2000
//			
//	-------------------------------
//	1.예금 | 2.출금 | 3.잔고 | 4.종료
//	-------------------------------
//	선택>3
//	잔고>8000
//	
//	-------------------------------
//	1.예금 | 2.출금 | 3.잔고 | 4.종료
//	-------------------------------
//	선택>4
//	프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean flag = true;
		
		for(; flag;) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				balance += sc.nextInt(); 	// 예금액 누적(+=)
				System.out.println();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= sc.nextInt(); 	// 출금액 차감(-=)
				System.out.println();
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);
				System.out.println();
				break;
			case 4:
				flag = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
