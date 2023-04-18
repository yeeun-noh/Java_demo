package ex10;

class Students {
	String name;
	int age;
	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student1{
	String name;
	int age;
	double weight;
	
	public Student1(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + weight);
	}
}

class Student2{
	String name;
	int age;
	double height;
	
	public Student2(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	void display() {
		System.out.println(name + ", " + age + ", " + height);
	}
}

class Student3{
	String name;
	int age;
	String grade;
	
	public Student3(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	void display() {
		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Exam05 {

	public static void main(String[] args) {
		
		Student1 a = new Student1("Kim", 20, 78.4);
		a.display();
		
		Student2 b = new Student2("Lee", 30, 150.0);
		b.display();
		
		Student3 c = new Student3("Park", 40, "A");
		c.display();	
	}

}
