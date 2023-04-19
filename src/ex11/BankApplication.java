package ex11;

import java.util.Scanner;

class Account {
	String accNum;
	String accName;
	int accAmount;
	Scanner sc = new Scanner(System.in);
	
	Account(String accNum, String accName, int accAmount){
		this.accNum = accNum;
		this.accName = accName;
		this.accAmount = accAmount;
	}
	
	void list() {
		System.out.println(accNum + " " + accName + " " + accAmount);
	}
	
	void deposit(int num) {
		accAmount += num;
	}
	
	void withdraw(int num) {
		accAmount -= num;
	}
}

public class BankApplication {

	static Account[] ac = new Account[100];
	static Scanner sc = new Scanner(System.in);
	
	static String accNum;
	static String accName;
	static int accAmount;

	static int count = 0;
	static boolean flag = true;

	public static void main(String[] args) {		
				
		while(flag) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1:
				createAccount();
				break;
				
			case 2: 
				listAccount();
				break;
			
			case 3:
				depositAccount();
				break;
			
			case 4:
				withdrawAccount();
				break;
			
			case 5:
				flag = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");            
		System.out.println("------");

		System.out.print("계좌번호: ");
		accNum = sc.nextLine();

		System.out.print("계좌주: ");
		accName = sc.nextLine();

		System.out.print("초기입금액: ");
		accAmount = Integer.parseInt(sc.nextLine()); 
		
		ac[count] = new Account(accNum, accName, accAmount);
		count++;
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	static void listAccount() {
		System.out.println("------");
		System.out.println("계좌목록");            
		System.out.println("------");	
		for(int i=0; i<count; i++) {
			ac[i].list();
	}
	}
	
	
	static void depositAccount() {
		System.out.println("------");
		System.out.println("예금");            
		System.out.println("------");		
		
		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		
		System.out.print("예금액: ");
		accAmount = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<count; i++) {
			if(ac[i].accNum.equals(accNum))
				ac[i].deposit(accAmount);
		}
	}

	static void withdrawAccount() {
		System.out.println("------");
		System.out.println("출금");            
		System.out.println("------");		
		
		System.out.print("계좌번호: ");
		accNum = sc.nextLine();
		
		System.out.print("출금액: ");
		accAmount = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<count; i++) {
			if(ac[i].accNum.equals(accNum))
				ac[i].withdraw(accAmount);
		}
		System.out.println("결과: 출금이 성공되었습니다.");
	}

}

/* (실행결과:)

---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>1
------
계좌생성
------
계좌번호: 111-111
계좌주: 홍길동
초기입금액: 10000
결과: 계좌가 생성되었습니다.
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>1
------
계좌생성
------
계좌번호: 111-222
계좌주: 강자바
초기입금액: 20000
결과: 계좌가 생성되었습니다.
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>2
------
계좌목록
------
111-111 홍길동 10000
111-222 강자바 20000
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>3
------
예금
------
계좌번호: 111-111
예금액: 5000
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>4
------
출금
------
계좌번호: 111-222
출금액: 3000
결과: 출금이 성공되었습니다.
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>2
------
계좌목록
------
111-111 홍길동 15000
111-222 강자바 17000
---------------------------------------------
1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
---------------------------------------------
선택>5
프로그램 종료

 */
