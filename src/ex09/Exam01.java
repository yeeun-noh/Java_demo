package ex09;

class Member1{
	int age;	//멤버변수, 인스턴스변수
	static int num; //클래스변수, 동적변수, 공유변수	
}

class Member2 {
	int age;	//멤버변수, 인스턴스변수
	static int num; //클래스변수, 동적변수, 공유변수
}

public class Exam01 {

	public static void main(String[] args) {
		
		Member1 m = new Member1();
		m.age = 20;
		m.num = 30; // Member1.num = 30;도 가능, 클래스변수는 객체생성없이 사용가능!
		
		Member1 m2 = new Member1();
		m2 = m;
		m2.age = 50;
	
		System.out.println(m.age);	//50
		System.out.println(m2.age);	//50
	}
		
}
