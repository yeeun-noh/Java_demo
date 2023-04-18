package ex10;

class Membersss {
	// private: 접근제어자 
	// 자기 자신의 클래스(Membersss)내에서만 접근가능 => 함수를 통해서만 name, age 접근가능 => setData() 만들어줌
	private String name;
	private int age;
	
	// public: 생성자
	// 인스턴스(객체)를 생성할때는 반드시 클래스 내에 정의된 생성자 중의 하나를 선택하여 지정해주어야 함
	// 생성자 ==> 반환타입x, 클래스이름과 같음, 오버로딩가능, 초기화기능 가지고 있음
	//
	// this ==>(1)지역변수와 멤버변수가 충돌날때, this를 붙이면 멤버변수 의미
	//	==>(2)생성자를 찾을때 사용됨
	public Membersss(String name, int age) { //name, age : 지역변수/매개변수 
		this.name = name; //(1)지역변수와 접근제어자(멤버변수)의 이름이 같을 때: "this.name"은 "private String name"을 의미 (인스턴스 자기 자신을 가리킴)
		this.age = age;
	}
	
	// 디폴트(default)생성자 : 자바가 직접생성함. (다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어줌)
	// -> 생성자가 있는경우, 디폴트 생성자를 직접 생성해야함!
	public Membersss() {
//		this.name = "C";
//		this.age = 20;
		this("C", 20); //(2)생성자를 찾아내서 사용
	}
	
	Membersss(String name) {
//		this.name = name;
//		this.age = 1;
		this(name, 1); //(2)생성자를 찾아내서 사용 (this는 참조변수, this()는 생성자)
	}
	
	void display() {
		System.out.println(name + ", " + age);
	}

//	void setData(String n, int a) {
//		name = n;
//		age = a;
//	}
}

public class Exam04 {

	public static void main(String[] args) {

		Membersss m1 = new Membersss("A", 26);
//		m1.setData("A", 26);

//		m1.name = "A";
//		m1.age = 26;
		
		Membersss m2 = new Membersss("B", 24);
//		m2.setData("B", 24);

//		m2.name = "B";
//		m2.age = 24;

		m1.display();
		m2.display();
		
		Membersss m3 = new Membersss();
		m3.display();
		
		Membersss m4 = new Membersss("D");
		m4.display();
		
	}

}
