package ex18_1;
// 박싱, 언박싱 리뷰
// 제네릭스 리뷰 , 제네릭스 사용하는 이유는 논리적에러를 방지 (Object클래스는 어느 타입이든 다 받기 떄문에 논리적에러 발생가능성 높음)

class Box<T> { //T는 Type의 약자! && <T>는 제네릭스를 사용한다는 의미내포!

	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {

		Box<Integer> box = new Box<Integer>();
		box.setOb(12345);
		Unboxer.openBox(box);
		System.out.println(box.getOb());
		
//		Unboxer unbox = new Unboxer(); //static클래스 이므로 객체생성 필요없음!
		Integer tmp = Unboxer.openBox(box).intValue(); //.intValue() 굳이 안해도 컴파일러가 박싱/언박싱 알아서 해줌!
		System.out.println(tmp);
	}

}
