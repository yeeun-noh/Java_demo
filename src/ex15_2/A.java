package ex15_2;
//중첩클래스

public class A {
	
	//중첩클래스:
	class B {
		int field = 1;			//멤버변수, 인스턴스변수
		private int field2 = 1;
		void test() {}			//멤버메서드, 인스턴스메서드
		
//		Java 17버전부터 허용:
//		static int field3 = 1;	//정적변수, 정적클래스변수
//		static void test2() {}	//정적메서드
		
		
		
		B() {
			System.out.println("B객체 생성");
		}
	}
	
	class C {
		C() {
			System.out.println("C객체 생성");
		}
	}
	
	B field = new B();
	C field2 = new C();
	
	A() {
		B b = new B(); //생성자호출
		System.out.println("A객체 생성");
	}
	
	void method() {
		B b = new B();
	}
}
