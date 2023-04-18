package ex10;
// 클래스변수, 인스턴스변수, 클래스메서드, 인스턴스메서드의 차이 설명:

class Member {
	String name;
	int age;
	int num;
	
	static int ban; //클래스변수(정적변수)
	static String ac;
	
	void func() {}
	
	void info() { //인스턴스메서드에서 모든 변수/메서드 사용가능
		age = ban;
		ban = num;
		func();
		info2();
		info3();
	}
	
	static void info2() {}

	static void info3() { //클래스메서드에서 인스턴스변수/인스턴스메서드 사용불가능
		ban = 200;
		ac = "abc";
		info2();
//		age = 20;
//		name = "John";
//		num = 10;
//		func();
//		info();
	}
}

// 클래스변수(정적변수), 클래스메서드(정적메서드) 들은 공유자원이면서 서로끼리만 데이터 주고 받음
public class Exam01 {

	public static void main(String[] args) {

		Member m = new Member();
		
	}

}
