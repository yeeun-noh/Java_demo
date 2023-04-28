package ex15_2;

public class AExam {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("-----------------");
		
		A.B b = a.new B();
		b.test();
		b.field = 10;
//		b.field2 = 10; //불가능 (private이기 때문)
		
	}
}
