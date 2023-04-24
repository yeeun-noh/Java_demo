package ex14;

import java.util.Calendar;

//싱글톤 패턴

class Sample {
	
}

class Singleton {
	//getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static이어야함:
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	//인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static이어야함:
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
}

public class SingletTonTest {

	public static void main(String[] args) {

		Sample s1 = new Sample();
		Sample s2 = new Sample();
		System.out.println(s1 == s2); //false => 각자 다른 객체를 가리킴(다른주소값 가짐)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------------------");
		
//		참조할때는 생성자를 호출해서 생성
//		Singleton sing1 = new Singleton(); // => 에러, 에러나는이유: 생성자가 private이기 때문(private는 외부에서 객체 생성불가능)
//		//==> public 메서드를 활용해서 private생성자 접근가능:
		Singleton sing1 = Singleton.getInstance(); //static메서드는 "클래스명.함수명" 으로 호출
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing1 == sing2); //true => 같은 객체를 가리킴(같은주소값 가짐)
		System.out.println(sing1);
		System.out.println(sing2);
		System.out.println("--------------------");
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
		
	}

}

/* (실행결과:)

false
ex14.Sample@626b2d4a
ex14.Sample@5e91993f
--------------------
true
ex14.Singleton@379619aa
ex14.Singleton@379619aa
--------------------
Mon Apr 24 14:28:05 KST 2023

*/
