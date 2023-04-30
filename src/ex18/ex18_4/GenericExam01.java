package ex18_4;
//지네릭스 - 와일드 카드
//상한 제한 - extends사용 (setter과 비슷!)

class A {}
class B extends A {}
class C extends B {}

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
	public static void peekBox(Box<? extends B> box) { //상한 제한
//	public static void peekBox(Box<? super Integer> box) { //하한 제한
		System.out.println(box.getOb());
	}
}

public class GenericExam01 {

	public static void main(String[] args) {

		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
		
//		Unboxer.peekBox(aBox); // Box<? extends B> 이므로! B와 B자손들만 가능!
		Unboxer.peekBox(bBox);
		Unboxer.peekBox(cBox);
	}
}
