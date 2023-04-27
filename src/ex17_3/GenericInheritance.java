package ex17_3;

class Box2<T> {
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class SteelBox<T> extends Box2<T> {
	public SteelBox(T o) {
		ob = o;
	}
}

public class GenericInheritance {

	public static void main(String[] args) {

		Box2<Integer> iBox = new SteelBox<Integer>(100);
		Box2<String> sBox = new SteelBox<String>("korea");
		
		System.out.println(iBox.get());
		System.out.println(sBox.get());
	}

}

/* (실행 결과:)

100
korea

*/
