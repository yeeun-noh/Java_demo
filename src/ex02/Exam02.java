package ex02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		//(Test)
		//나의 이름, 주소, 나이(만으로입력)를 입력 받아서 출력하는 프로그램 작성..(단 나이는 +1해서 출력)
		
		Scanner sc = new Scanner(System.in);
		
		// nextLine() or nextInt()
		System.out.println("당신의 나이는? >>");
		int age = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼 남아있는 엔터를 제거해야함!
		// 이유는 엔터를 제거하지 않으면,
		// String name = sn.nextLine(); 이 문장에서 엔터를 문장으로 인식해서 버퍼 남은 엔터를 name변수에 넣음
		
		System.out.println("당신의 이름은? >>");
		String name = sc.nextLine();
		
		System.out.println("당신의 주소는? >>");
		String address = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
	}

}
