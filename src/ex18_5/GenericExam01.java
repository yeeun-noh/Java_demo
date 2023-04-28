package ex18_5;
//지네릭스 - 와일드 카드
//하한 제한

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer {
//	public static void peekBox(Box<? extends B> box) { //상한 제한
	public static void peekBox(Box<? super B> box) { //하한 제한
		System.out.println(box.getOb());
	}
}

public class GenericExam01 {

	public static void main(String[] args) {

		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		Box<D> dBox = new Box<>();
		Box<Object> oBox = new Box<>();
		
		Unboxer.peekBox(aBox);
		Unboxer.peekBox(bBox);
//		Unboxer.peekBox(cBox); // Box<? super B> 이므로! B와 B조상들만 가능!
//		Unboxer.peekBox(dBox); // Box<? super B> 이므로! B와 B조상들만 가능!
		Unboxer.peekBox(oBox);		
	}
}
