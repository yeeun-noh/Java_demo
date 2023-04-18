package ex10;

class Members {
	// private: 접근제어자 
	// 자기 자신의 클래스(Members)내에서만 접근가능 => 함수를 통해서만 name, age 접근가능 => setData() 만들어줌
	private String name;
	private int age;
	
	void display() {
		System.out.println(name + ", " + age);
	}

	void setData(String n, int a) {
		name = n;
		age = a;
	}
}

public class Exam02 {

	public static void main(String[] args) {

		Members m1 = new Members();
		m1.setData("A", 26);
		
//		m1.name = "A";
//		m1.age = 26;
		
		Members m2 = new Members();
		m2.setData("B", 24);

//		m2.name = "B";
//		m2.age = 24;

		m1.display();
		m2.display();
	}

}
