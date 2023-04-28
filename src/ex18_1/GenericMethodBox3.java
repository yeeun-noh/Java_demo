package ex18_1;
// 박싱, 언박싱 리뷰
// 제네릭스 리뷰 , 제네릭스 사용하는 이유는 논리적에러를 방지 (Object클래스는 어느 타입이든 다 받기 떄문에 논리적에러 발생가능성 높음)

class A {}
class B extends A {} 
class C extends B {}

class Box3<T extends A> {

	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer3 {
	public static <T extends A> T openBox(Box3<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox3 {

	public static void main(String[] args) {

		Box3<C> cbox = new Box3<C>();
		Box3<B> bbox = new Box3<B>();
		Box3<A> abox = new Box3<A>();
//		Box3<A> aabox = bew Box3<B>(); //=> error(타입 불일치)
	
	}

}
