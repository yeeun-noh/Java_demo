package ex14;
//인터페이스(interface)

interface Animals {
	void eat();				//public abstract 생략되어 있음
	public abstract void sleep();		//public abstract 생략가능
	default void sound() {};		//구현해도되고 구현하지 않아도 되는 메서드(default 추가하기)
}

class Cats implements Animals {
	@Override
	public void eat() {
		System.out.println("고양이는 먹는다");
	}
	@Override
	public void sleep() {
		System.out.println("고양이는 잔다");
	}
	
	public void sound() {
		System.out.println("야옹");
	}
}

class Dogs implements Animals {
	@Override
	public void eat() {
		System.out.println("강아지는 먹는다");
	}
	@Override
	public void sleep() {
		System.out.println("강아지는 잔다");
	}	
}

public class InterfaceTest {

	public static void main(String[] args) {

//		Dogs d = new Dogs();
//		d.eat();
//		d.sleep();

		Animals an = new Cats();
		an.eat();
		an.sleep();
		an.sound();
		
		an = new Dogs(); //최상위클래스만 참조함
		an.eat();
		an.sleep();
		
	}

}
