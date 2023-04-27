package ex17_3;
// 타입에 제한주기 :
// <T extends Number> => Number와 그 자손들만 가능

class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

class BoxFactory { 
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed   Data : " + o.intValue()); //intValue() : 래퍼클래스를 정수형으로 변환해줌(단, 타입을 알고있고 제한했을때만) 
		return box;
	}
}

class Unboxer {
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("Unboxed Data : " + box.get().intValue());
		return box.get();
	}
}

public class BoundedGenericMethod {

	public static void main(String[] args) {
		
		Box<Integer> sBox = BoxFactory.makeBox(new Integer(7));
		int n = Unboxer.openBox(sBox);
		System.out.println("n : " + n);
		
		System.out.println("-----------------------------");
		
		Box<Double> sBox2 = BoxFactory.makeBox(new Double(7.77));
		Double n2 = Unboxer.openBox(sBox2); //double != Double (하지만 박싱/언박싱으로 인해 자동변환해주므로, 따지고 보면 둘다 사용가능함!)
		System.out.println("n2 : " + n2);
	}

}

/* (실행 결과:)

Boxed   Data : 7
Unboxed Data : 7
n : 7
-----------------------------
Boxed   Data : 7
Unboxed Data : 7
n2 : 7.77

*/
