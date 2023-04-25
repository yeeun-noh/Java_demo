package ex15_3;
//중첩클래스

public class A {
	
	static class B {
		B() { System.out.println("B객체 생성"); }
	}
	
	static class C {
		C() { System.out.println("C객체 생성"); }
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
	
	static void method2() {
		B b = new B();
	}
}
