package ex02;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//(Test)		
		// 면접점수 70이상, 실기점수 70이상 합격 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("면접점수 입력 >>");
		int a = sc.nextInt();
				
		System.out.println("실기점수 입력 >>");
		int b = sc.nextInt();
		
		if(a>=70) {
			if(b>=70) {
				System.out.println("합격입니다!");
			} else {
				System.out.println("불합격입니다!");				
			}
		}else {
			System.out.println("불합격입니다!");
		}
		
		System.out.println("프로그램 종료");
	}

}
