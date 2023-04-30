package ex17_2;

class Apple3 {
@Override
	public String toString() {
		return "I am an apple";
	}	
}

class Orange3 {
@Override
	public String toString() {
		return "I am an orange";
	}	
}

class Box2 {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class FruitAndBox3 {

	public static void main(String[] args) {

		Box2 aBox = new Box2();
		Box2 oBox = new Box2();
		
//		aBox.setObj(new Apple2());
//		oBox.setObj(new Orange2());	
		aBox.setObj("Apple");
		oBox.setObj("Orange");	
		
//		Apple3 ap = (Apple3)aBox.getObj();		//"Apple"은 String을 참조하고 있으므로 에러
//		Orange3 or = (Orange3)oBox.getObj();	//"Orange"은 String을 참조하고 있으므로 에러
//		System.out.println(ap);
//		System.out.println(or);

		System.out.println(aBox.getObj());
		System.out.println(oBox.getObj());
	}

}
