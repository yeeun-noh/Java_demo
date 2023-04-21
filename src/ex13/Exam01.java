package ex13;

class B {
	static void f1() {
		System.out.println("f1()");
	}
}

class K extends B {
	static void f2() {
		System.out.println("f2()");
	}
}

class C extends B {
	static void f3() {
		System.out.println("f3()");
	}
}

class E extends B {
	static void f4() {
		System.out.println("f4()");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		func(new B());
		func(new K());
		func(new C());
		func(new E());
	}

	static void func(B b) {
		if(b instanceof K) {
			K kk = (K)b;
			kk.f2();
		}else if(b instanceof C) {
			C cc = (C)b;
			cc.f3();
		}else if(b instanceof E) {
			E ee = (E)b;
			ee.f4();
		}else if(b instanceof B) { //이문장은 첫번쨰로 오면 안됨
			b.f1();
		}	
	}
}

/* (실행결과:)

f1()
f2()
f3()
f4()

*/
