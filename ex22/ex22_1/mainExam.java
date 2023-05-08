package ex22_1;
//출력 => 이름: 홍길동, 나이:20, 학년:3학년

class Person {
	private String name;
	private int age;
	
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//기능추가
	public String toString() {
		return "이름: "+ name + ", 나이: " + age;
	}
}

class Student extends Person {
	private int grade;
	
	//기능추가	
	Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public String toString() {
		return super.toString() + ", 학년: " + grade + "학년";
	}
}

public class mainExam {

	public static void main(String[] args) {

		Person p = new Student("홍길동", 20, 3);
		System.out.println(p.toString());
	}

}
