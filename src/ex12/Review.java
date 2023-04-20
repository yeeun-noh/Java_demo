package ex12;
//어제 했던것 복습

import java.util.Scanner;

class Account {
	String accNum;
	String accName;
	int accAmount;

	Account(String accNum, String accName, int accAmount){
		this.accNum = accNum;
		this.accName = accName;
		this.accAmount = accAmount;
	}

	void display() {
		System.out.println(accNum + " " + accName + " " + accAmount);
	}

	void deposit(int num) {
		accAmount += num;
	}

	void withdraw(int num) {
		accAmount -= num;
	}
}

public class Review {

	static String accNum;
	static String accName;
	static int accAmount;

	static Account[] acc = new Account[100];
	static Scanner sc = new Scanner(System.in);

	static int count = 0;
	static boolean flag = true;

	static public void main(String[] args) {

		while(flag) {

			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금| 5.종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			int num = Integer.parseInt(sc.nextLine());

			if(num==1)
				createAccount();
			else if(num==2)
				listAccount();
			else if(num==3)
				depositAccount();
			else if(num==4)
				withdrawAccount();
			else if(num==5) {
				flag = false;
				break;
			}
			
//			switch(num) {
//			case 1:
//				createAccount();
//				break;
//			case 2:
//				listAccount();
//				break;
//			case 3:
//				depositAccount();
//				break;
//			case 4:
//				withdrawAccount();
//				break;
//			case 5:
//				flag = false;
//			}
			
		}
		System.out.println("프로그램 종료");
	}

	static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		System.out.print("계좌주: ");
		accName = sc.nextLine();
		System.out.print("초기입금액: ");
		accAmount = Integer.parseInt(sc.nextLine());

		acc[count] = new Account(accNum, accName, accAmount);
		count++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	static void listAccount() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");

		for(int i=0; i<count; i++)
			acc[i].display();
	}

	static void depositAccount() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");


		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		System.out.print("예금액: ");
		accAmount = Integer.parseInt(sc.nextLine());

		for(int i=0; i<count; i++) {
			if(acc[i].accNum.equals(accNum))
				acc[i].deposit(accAmount);
		}
	}

	static void withdrawAccount() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");


		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		System.out.print("출금액: ");
		accAmount = Integer.parseInt(sc.nextLine());

		for(int i=0; i<count; i++) {
			if(acc[i].accNum.equals(accNum))
				acc[i].withdraw(accAmount);
		}
		System.out.println("결과: 출금되었습니다.");
	}
}
