package ex24;

public class MainExam {

	static void test(A test) {
		if(test instanceof D ) {
//			D d = new D();
			//둘다 가능:
			D d = (D)test;
			d.funcD();
		} else if(test instanceof E) {
//			E e = new E();
			//둘다가능:
			E e = (E)test;
			e.funcE();
		}
	}
	
	public static void main(String[] args) {
//		A a = new A(); //인터페이스(A)는 불완전하므로 자신 객체생성불가 (A인터페이스를 구현한 클래스만 객체생성가능)
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		
		B b = new B(); //클래스(B)는 객체 자신과 자신을 상속하는 하위클래스 객체생성가능
//		B b2 = new C();
		B b3 = new D();
//		B b4 = new E();
		
		C c = new C(); //클래스(C)는 객체 자신과 자신을 상속하는 하위클래스 객체생성가능
//		C c2 = new D();
		C c3 = new E();
		
		D d = new D(); //클래스(D)는 객체 자신과 자신을 상속하는 하위클래스 객체생성가능(D는 하위클래스 없음)
		//D d2 = (D)b; //=>강제 형변환 가능!

		E e = new E(); //클래스(E)는 객체 자신과 자신을 상속하는 하위클래스 객체생성가능(E는 하위클래스 없음)
		//E e2 = (E)c; //=>강제 형변환 가능!
		
		
//		메서드 호출도 마찬가지(인터페이스 자신 호출불가):
//		test( new A() );
		test( new B() );
		test( new C() );
		test( new D() );
		test( new E() );
	}    

}
