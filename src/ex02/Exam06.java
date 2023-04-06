package ex02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		//(Test)
		// 세 정수를 입력받아서 최대값과 최소값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		
		System.out.println("세 정수를 입력해주세요. \n 첫번째 정수 >>");
		num1 = sc.nextInt();
		
		System.out.println("두번째 정수 >>");
		num2 = sc.nextInt();
		
		System.out.println("세 번째 정수 >>");
		num3 = sc.nextInt();
		
		//최대값 구하기 :
		if(num1>num2) {
			if(num1>num3) max = num1;
			else max = num3;
		} else {
			if(num2>num3) max = num2;
			else max= num3;
		}
				
		//최소값 구하기 :
		if(num1>num2) {
			if(num2>num3) min = num3;
			else min = num2;
		} else {
			if(num1>num3) min = num3;
			else min = num1;
		}
		
	// 또 다른 방법 :
		max = (num1>num2)?((num1>num3)?num1:num3) : ((num2>num3)?num2:num3);
		min = (num1>num2)?((num2>num3)?num3:num2) : ((num1>num3)?num3:num1);
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("프로그램 종료");
	}
}
