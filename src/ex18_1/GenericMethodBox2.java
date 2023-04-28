package ex18_1;
// 박싱, 언박싱 리뷰
// 제네릭스 리뷰 , 제네릭스 사용하는 이유는 논리적에러를 방지 (Object클래스는 어느 타입이든 다 받기 떄문에 논리적에러 발생가능성 높음)

class Box2<T extends Number> { //T를 Number이거나 Number의 자손들로 제한!

	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer2 {
	public static <T extends Number> T openBox(Box2<T> box) {
		return box.getOb();
	}
}

public class GenericMethodBox2 {

	public static void main(String[] args) {

		Box2<Float> box = new Box2<Float>();
		box.setOb(123.45f);
		Unboxer2.openBox(box);
		System.out.println(box.getOb());
	}

}
