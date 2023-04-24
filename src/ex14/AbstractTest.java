package ex14;
// 추상클래스, 추상메서드

abstract class Animal {		//abstract class (추상클래스) : 상속을 통해서만 구현해주어야함(객체생성 허용안함)
	abstract void makeSound() ;	//abstract method (추상메서드) : 상속받은 클래스들은 무조건 추상메서드를 오버라이딩으로 구현해야함!
	//- 추상메서드는 {}구현부없음
	//- 안정성 높임
	
	void sound() {};
}

class Cat extends Animal{

	@Override //어노테이션(@) + 상위클래스(Override) ==> 상위클래스는 재정의 하겠다는 적극적 표현 (사용자의 실수 줄임!)
	void makeSound() {
		System.out.println("야옹 야옹");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("멍!");
	}
}

class Pig extends Animal {
	void makeSound() {
		System.out.println("꿀꿀");
	}
}

class Rabbit extends Animal {
	void makeSound() {
		System.out.println("나는 토끼!");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
//		첫번째방법:
//		Cat cat = new Cat();
//		cat.makeSound();
//		Dog dog = new Dog();
//		dog.makeSound();
//		Pig pig = new Pig();
//		pig.makeSound();
//		Rabbit rabbit = new Rabbit();
//		rabbit.makeSound();
		
		System.out.println("-------------------");

		Animal[] animals = { new Cat(), new Dog(), new Pig(), new Rabbit() };
		
		//두번째방법:
		for(int i=0; i<animals.length; i++)
			animals[i].makeSound();
		
		//세번째방법:
		for(Animal a : animals) //: 향상된for문
			a.makeSound();
		
		System.out.println("-------------------");
		
//		추상클래스는 참조안됨
//		Animals an = new Animals();
//		an.makeSound();
	}

}
