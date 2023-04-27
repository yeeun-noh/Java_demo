package ex17_2;
//지네릭스(Generics) :클래스(인터페이스) 내부에서 사용할 데이터의 타입을 외부에서 동적으로 전달하여, 컴파일 시에 타입을 미리 지정하고 타입 체크를 하는 기법
// 제네릭스를 사용하여 타입을 미리 지정한다면, 개발자가 따로 일일이 형변환을 할 필요도 없고, 컴파일 단계에서 타입 체크를 하기 때문에 에러를 사전에 방지할 수 있음 
//이것이 바로 제네릭을 사용해야만 하는 가장 큰 이유!

class Apple4 {
@Override
	public String toString() {
		return "I am an apple";
	}	
}

class Orange4 {
@Override
	public String toString() {
		return "I am an orange";
	}	
}

class Box3<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class FruitAndBox4 {

	public static void main(String[] args) {

		Box3<Apple4> aBox = new Box3<Apple4>();		//T에 Apple4 넣어지게 됨 => Apple객체만 저장가능해짐
		Box3<Orange4> oBox = new Box3<Orange4>();	//T에 Orange4 넣어지게 됨 => Orange객체만 저장가능해짐
		
		aBox.setObj(new Apple4());
		oBox.setObj(new Orange4());
		
		Apple4 ap = aBox.getObj();	//타입변환 필요없음 (지네릭스로 이미 "Apple"타입을 받아줌)
		Orange4 or = oBox.getObj(); //타입변환 필요없음 (지네릭스로 이미 "Orange"타입을 받아줌)
		
		System.out.println(ap);
		System.out.println(or);

	}
}
