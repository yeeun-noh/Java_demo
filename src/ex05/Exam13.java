package ex05;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
//		(Test)
//		1. 몇개의 숫자를 받을지 물어보는 코드 작성하고,
//		2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
//		3. 소수점이나 문자를 받으면, 다시 쓰라고 해야하며 일을 끝내야함
//
//		정수만 '5'회 입력
//		90, 80, 88, 66, 55 ==> 90+80+66 의 합을 구해서 출력
//
//		정수만 5회 입력
//		90, 66.7(X), 50, 55, aa(X), 80, 45
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("몇회 입력>> ");
		int number = sc.nextInt();
	     
		while (count < number) {
			System.out.print("숫자를 입력하세요: ");
	        	if (sc.hasNextInt()) { //int타입일떄 true
	        	// sc.hasNextInt() : sc객체에 입력값이 int값일 때만 true를 반환함, 나머지는 false
	        		int num = sc.nextInt();
	        		if (num % 2 == 0) {
	        			sum += num;
	        		}
	        		count++;
	        	} else if (sc.hasNextDouble()) { //double타입일때 true
	        		sc.next();
	          		System.out.println("실수는 입력 불가 입니다. 다시 입력해주세요.");
	        	} else {
	          		sc.next();  //버퍼없애줌
	      	 	  // or sc.nextLine();
	          		System.out.println("정수가 아닙니다. 다시 입력해주세요.");
	        	}
		}
		System.out.println("짝수의 합: " + sum);
	}

}
