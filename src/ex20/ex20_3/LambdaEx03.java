package ex20_3;
//람다식 (Lambda expression)

interface Aaa {
	int square(int x);
}

interface Bbb {
	void printVal(String name, int i);
}

interface Ccc {
	void func();
}

public class LambdaEx03 {

	public static void main(String[] args) {

		Aaa a = x -> x * x;
		System.out.println(a.square(10));
		
		Bbb b = (name, i)-> System.out.println(name + "=" + i);
		b.printVal("Kim", 20);
		
		Ccc c = ()-> System.out.println("------");
		c.func();
	}
}

/* (실행 결과:)

100
Kim=20
------

*/
