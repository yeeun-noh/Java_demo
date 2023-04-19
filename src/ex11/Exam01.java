package ex11;

class A extends Object {	//상위클래스는 Object클래스를 자동으로 상속받고 있음
	int a;
	int c =100;
	
	A() {}			//클래스에 생성자가 없으면, 컴파일러가 자동적으로 기본생성자를 만들어줌

	A(int a, int c) {
		this.a = a;
		this.c = c;
	}
	void func() {
		System.out.println("func()");
	}
}

class B extends A {
	int b;
	int c =200;
	
	B() {
		super(); 	//super()은 상위클래스(기본생성자)를 찾아감, super()과 기본생성자는 잠재되있음!
					    //=> 할일을 다하면 다시 이자리로 와서 코드룰 순서대로 계속 실행
	}
	
	B(int a, int b) {
		super(a, b);
	}
	
	void func2() {
		System.out.println("func2()");
	}
}

class C extends A {		//C클래스는 B클래스와 아무런 관계도 성립되지 않음(형제관계없음!)
	int k;
	void func3() {
		System.out.println("func3()");
	}
}

class D extends C {		//D클래스는 C클래스와 A클래스에 접근가능 (단, 생성자들 제외)
	int d;
	void func4() {
		System.out.println("func4()");
	}
}

public class Exam01 {

	public static void main(String[] args) {

		// 상속을 받는 (자손)하위클래스는 하위클래스, 상위클래스에 있는 모든 변수 사용가능
		B b = new B(1,2);
		b.a = 10;
		b.b = 20;
		b.func();
		b.func2();
		System.out.println(b.c); //A클래스, B클래스 모두 변수c가 있을때, 자신의 클래스의 변수먼저 사용함 => b.c = 200
		System.out.println("--------------------");
		
		// 상속을 하는 (조상)상위클래스는 상위클래스에 있는 변수들만 사용가능
		A a = new A();
		a.a = 1; 
		a.c = 2;
		a.func();
		System.out.println("--------------------");

		C c = new C();
		System.out.println("--------------------");
		
		D d = new D();
	}

}

/* (실행결과:)

func()
func2()
200
--------------------
func()

 */
