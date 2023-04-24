package ex14;
// 접근 제어자 (access modifier)
//- 접근제어자가 사용될수 있는곳 => 클래스, 멤버변수, 메서드, 생성자
//public (같은패키지+다른패키지에서 접근가능) > protected (같은패키지, 다른패키지의 자손클래스에서 접근가능) > default (같은패키지, 모든클래스 내에서 접근가능) > private (같은패키지, 같은클래스 내에서만 접근가능)

public class ModifierTest {

	public static void main(String[] args) {

		//같은 package(ex14) 클래스 사용가능:
		ModifierTest2 e = new ModifierTest2();

		e.setNum(20);
		System.out.println("num= " + e.getNum());
		
		e.setName("abc");
		System.out.println("string= " + e.getName());
	}

}
