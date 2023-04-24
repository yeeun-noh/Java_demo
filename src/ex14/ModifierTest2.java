package ex14;
//접근 제어자 (access modifier)
//- 접근제어자가 사용될수 있는곳 => 클래스, 멤버변수, 메서드, 생성자
//public (같은패키지+다른패키지에서 접근가능) > protected (같은패키지, 다른패키지의 자손클래스에서 접근가능) > default (같은패키지, 모든클래스 내에서 접근가능) > private (같은패키지, 같은클래스 내에서만 접근가능)

public class ModifierTest2 {
	private int num;
	private String name;
	private int age;
	
	//Source > Generate Getters and Setters누르면 자동으로 생성됨:
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Study { //default 생략되어있음
	int count = 0;
}
