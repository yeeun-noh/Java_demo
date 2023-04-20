package ex12;

//하위클레스 => 상위클래스 (접근/사용 가능) + (참조불가능)
//상위클레스 => 하위클래스 (접근/사용 불가능==> 오버라이딩하면 그 함수만 사용가능) + (참조가능)

class Object {
	void tostring() {
		System.out.println("Object클래스의 tostring()");
	}
	
	void onlyObject() {
		System.out.println("Object클래스의 onlyObject()");
	}
}

class A extends Object{ 
	int i = 10;
	
	void func() {
		System.out.println("A클래스의 func(), i의값은 " + i);
	}
	
	void tostring() {	//오버라이딩
		System.out.println("A클래스의 tostring()");
	}
	
	void onlyA() {
		System.out.println("A클래스의 onlyA()");
	}
}

class B extends A {
	int i = 20;
	
	void func() {		//오버라이딩
		System.out.println("B클래스의 func(), i의값은 " + i);
	}
	
	void tostring() {	//오버라이딩
		System.out.println("B클래스의 tostring()");
	}
	
	void onlyB() {
		System.out.println("B클래스의 onlyB()");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		//상위클래스는 하위클래스 참조가능 (하위클래스는 상위클래스 참조불가능):
		A aa = new B();			//aa는 A클래스와 Object클래스 접근/사용가능
		Object ob = new B(); 	//ob는 Object클래스만 접근/사용가능
//		B bb = new A(); 		//불가능 (하위클래스는 상위클래스 참조불가능)
		
		
		
		//오버라이딩을 통해, 하위클래스의 함수 접근/사용가능:
		a.tostring();	//A클래스의 tostring()
		b.tostring();	//B클래스의 tostring()
		aa.tostring();	//B클래스의 tostring()
		ob.tostring();	//B클래스의 tostring()

		//하위클래스가 상위클래스의 함수를 오버라이딩하면, 상위클래스는 하위클래스에 접근가능(단, 오버라이딩한 함수만 접근가능):
		a.func();		//A클래스의 func(), i의값은 10
		b.func();		//B클래스의 func(), i의값은 20
		aa.func();		//B클래스의 func(), i의값은 20
//		ob.func();		//에러, Object클래스(ob)가 B클래스를 참조하고있지만 (오버라이딩 함수 제외,) Object클래스만 접근/사용가능!

		b.onlyB();		//B클래스의 onlyB()
//		aa.onlyB(); 	//에러, A클래스(aa)가 B클래스를 참조하고있지만 (오버라이딩 함수 제외,) A클래스,Object클래스만 접근/사용가능!				
	}

}
