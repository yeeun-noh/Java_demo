package ex18_7;

class Box<T> { //T == Object == 최상위 클래스
	private T ob;

	public T getOb() {	  //getter: 꺼내는 기능 (extends 사용)
		return ob;
	}

	public void setOb(T ob) { //setter: 넣는 기능 (super 사용)
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
//		box.setOb(new Toy()); //=>  <? extends Toy> 넣음으로써 set기능 못쓰게 됨
//		(이유: T는 Object이므로, setOb(T ob)의 T(Object)에 Toy(extends)가 접근/사용 불가 하기 때문 )
//		(결과적으로 extends를 사용하게 되면 getOb(getter)만 사용가능!)
		System.out.println(toy);
	}
	
	
// setter기능(넣는 기능)만 가능하게하기 => super 사용하기 :
//	public static void inBox(Box<Toy> box, Toy n) {
	public static void inBox(Box<? super Toy> box, Toy n) {
//		Toy toy = box.getOb(); //=>  <? super Toy> 넣음으로써 get기능 못쓰게 됨
//		(이유: T는 Object이므로, setOb(T ob)의 T(Object)에 Toy(super)가 접근/사용 가능하기 때문 )
//		(결과적으로 super를 사용하게 되면 setOb(setter)만 사용가능!)
		box.setOb(n); 
		System.out.println(n);
	}
}

public class BoundedWildcardBase {

	public static void main(String[] args) {

		Box<Toy> box = new Box<Toy>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}

/* (실행결과:)

I am a Toy()
I am a Toy()
  
 */
