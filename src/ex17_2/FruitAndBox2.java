package ex17_2;

class Apple2 {
@Override
	public String toString() {
		return "I am an apple";
	}	
}

class Orange2 {
@Override
	public String toString() {
		return "I am an orange";
	}	
}

class Box {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class FruitAndBox2 {

	public static void main(String[] args) {

		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj(new Apple2());
		oBox.setObj(new Orange2());	
		
		Apple2 ap = (Apple2)aBox.getObj();	//타입 변환해주기
		Orange2 or = (Orange2)oBox.getObj();//타입 변환해주기
		
		System.out.println(ap);
		System.out.println(or);
	}

}
