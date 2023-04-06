package ex01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 나의 이름, 주소, 나이(만으로입력)를 입력 받아서 출력하는 프로그램 작성..(단 나이는 +1해서 출력)
		
		Scanner sn = new Scanner(System.in);
		
		// nextLine() or nextInt()
		System.out.println("당신의 이름은? >>");
		String name = sn.nextLine();
		
		System.out.println("당신의 주소는? >>");
		String address = sn.nextLine();
		
		System.out.println("당신의 나이는? >>");
		int age = sn.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
	}

}
