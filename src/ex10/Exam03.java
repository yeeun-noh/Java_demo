package ex10;

class Memberss {
	// private: 접근제어자 
	// 자기 자신의 클래스(Memberss)내에서만 접근가능 => 함수를 통해서만 name, age 접근가능 => setData() 만들어줌
	private String name;
	private int age;
	
	// public: 생성자
	// 인스턴스(객체)를 생성할때는 반드시 클래스 내에 정의된 생성자 중의 하나를 선택하여 지정해주어야 함
	// 생성자 ==> 반환타입x, 클래스이름과 같음, 오버로딩가능, 초기화기능 가지고 있음
	public Memberss(String n, int a) {
		name = n;
		age = a;
	}
	
	// 디폴트(default)생성자 : 자바가 직접생성함. (다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어줌)
	// -> 생성자가 있는경우, 디폴트 생성자를 직접 생성해야함!
	public Memberss() {
		name = "C";
		age = 20;
	}
	
	Memberss(String s) {
		name = s;
		age = 1;
	}
	
	void display() {
		System.out.println(name + ", " + age);
	}

//	void setData(String n, int a) {
//		name = n;
//		age = a;
//	}
}

public class Exam03 {

	public static void main(String[] args) {

		Memberss m1 = new Memberss("A", 26);
//		m1.setData("A", 26);

//		m1.name = "A";
//		m1.age = 26;
		
		Memberss m2 = new Memberss("B", 24);
//		m2.setData("B", 24);

//		m2.name = "B";
//		m2.age = 24;

		m1.display();
		m2.display();
		
		Memberss m3 = new Memberss();
		m3.display();
		
		Memberss m4 = new Memberss("D");
		m4.display();
		
	}

}
