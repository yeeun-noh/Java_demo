package ex10;
// 상속
// this/this() 와 super/super() 의 차이점
// this vs super ==> 멤버변수와 지역변수의 이름이 같을때 this를 붙여서 구별했듯이, 상속받은 멤버와 자신의 멤버와 이름이 같을때는 super를 붙여 구별 가능함!
// this() vs super() ==> this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만, super()는 조상클래스의 생성자를 호출하는데 사용됨!

class Studentss {
	String name;
	int age;
		
	public Studentss(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println(name + ", " + age);
	}
}

class Student11 extends Studentss{
	double weight;
	
	public Student11(String name, int age, double weight) {
		super(name, age); 	//조상클래스를 호출! (조상클래스의 매개변수와 자손클래스의인자가 일치해야함)
		this.weight = weight;	//자신과 같은 클래스의 다른 생성자를 호출!
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + weight);
	}
}

class Student22 extends Studentss{
	double height;
	
	public Student22(String name, int age, double height) {
		super(name, age);
		this.height = height;
	}

	void display() {
		System.out.println(name + ", " + age + ", " + height);
	}
}

class Student33 extends Studentss{
	String grade;
	
	public Student33(String name, int age, String grade) {
	super(name,age);
	this.grade = grade;
	}
	
	void display() {
		System.out.println(name + ", " + age + ", " + grade);
	}
}

public class Exam06 {

	public static void main(String[] args) {
			Student11 s1 = new Student11("Kim", 20, 78.4);
			s1.info(); //Kim, 20
			s1.display(); //Kim, 20, 78.4
			
			Student22 s2 = new Student22("Lee", 30, 150.0);
			s2.info(); //Lee, 30
			s2.display(); //Lee, 30, 150.0
			
			Student33 s3 = new Student33("Park", 40, "A");
			s3.info(); //Park, 40
			s3.display(); //Park, 40, A
	}

}
