package ex15_4;
//중첩클래스

public class A {
	
	A() {
		class B {
			public B() {
				System.out.println("B객체 생성");
			}
		}
		
		B b = new B();
		System.out.println("A객체 생성");
	}
	
	void method() {
		class C {
			public C() {
				System.out.println("C객체 생성");
			}
		}
		
		C c = new C();
	}
}
