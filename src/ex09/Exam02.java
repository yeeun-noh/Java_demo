package ex09;

class Memberr {
	// 오버로딩: 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
	// 1. 메서드이름이 같아야함
	// 2. 매개변수의 개수 또는 타입이 달라야함

	int func(int n) {
		System.out.println("int");
		return n;
	}
	
	double func(double d) {
		System.out.println("double");
		return d;
	}
	
	String func(String str) {
		System.out.println("String");
		return str;
	}

	int func(int n1, int n2) {
		System.out.println("int, int");
		return n1 + n2;
	}
}

public class Exam02 {

	public static void main(String[] args) {
		
		Memberr m = new Memberr();
		System.out.println(m.func(10, 2)); //매개변수의 타입, 개수를 통해 자동으로 int func(int n1, int n2)를 호출
	}
		
}
