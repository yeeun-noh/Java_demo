package ex10;

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
		super(name);
		this.studentNo = studentNo;
	}
	
	void print() {
		System.out.println(name + ", " +studentNo);
	}
}

public class Exam07 {

	public static void main(String[] args) {

		Child ch = new Child("Kim", 2);
		ch.print();
	}

}
