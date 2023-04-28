package ex18_6;

class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Toy {
	@Override
	public String toString() {
		return "I am a Toy()";
	}
}

class BoxHandler {
	// getter기능(꺼내는 기능)만 가능하게하기 => extends 사용하기 :
//	public static void outBox(Box<Toy> box) {
	public static void outBox(Box<? extends Toy> box) {
		Toy toy = box.getOb(); 
//		box.setOb(new Toy()); //=> <? extends Toy> 넣음으로써 set기능 못쓰게 됨
		System.out.println(toy);
	}
	
	
	// setter기능(넣는 기능)만 가능하게하기 => super 사용하기 :
//	public static void inBox(Box<Toy> box, Toy n) {
	public static void inBox(Box<? super Toy> box, Toy n) {
//		Toy toy = box.getOb(); //=> <? super Toy> 넣음으로써 get기능 못쓰게 됨
		box.setOb(n); 
	}
}

public class BoundedWildcardBase {

	public static void main(String[] args) {

		Box<Toy> box = new Box<Toy>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
