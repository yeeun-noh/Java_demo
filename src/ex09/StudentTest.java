package ex09;

class Student{
	String name;
	String address;
	int age;              	//인스턴스변수(==멤버변수)
	static int count;	//클래스변수(==정적변수, 공유변수)
	
	void displayInfo() {	//인스턴스메서드
		count++;        //인스턴스변수 사용가능
		System.out.println(name + ", " + age + ", " + address + ", 현재학생수: "+ count);
	}
	
	static void Info() {	//클래스메서드
		count++;        //클래스변수 사용가능
//		age++;          //인스턴스변수 사용 불가능!
//		displayInfo();  //인스턴스메서드 사용 불가능!
		
//		클래스변수, 클래스메서드는  객체가 생성되기 전 제일처음으로 메서드영역(methodarea)에 저장되어있음
//		=> 클래스메서드는 클래스변수 사용가능!(인스턴스변수,인스턴스메서드는 사용불가능!)
//		
//		인스턴스변수, 인스턴스메서드는 객체를 생성후, heap에서 callstack(호출스택)으로 불러 저장함(순서로 따지면 메서드영역 후, 제일 마지막)
//		=> 인스턴스메서드는 모두 사용가능! (마지막으로 객체를 생성하므로!)
	}
}

//	한 파일안에 public클래스 하나만 존재해야함(public클래스안에 main메서드 존재해야함) + 파일명과 public클래스명이 같아야함
public class StudentTest {
	
	public static void main(String[] args) {

		Student kim = new Student();
		kim.name = "김";
		kim.age = 20;
		kim.address = "수원";
		
		Student park = new Student();
		park.name = "박";
		park.age = 30;
		park.address = "서울";

		Student lee = new Student();
		Student hong = new Student();

		kim.displayInfo();
		park.displayInfo();
		lee.displayInfo();
		hong.displayInfo();
	}
	
}
