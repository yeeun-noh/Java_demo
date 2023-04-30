package ex16_4;
//java.lang패키지 :
//equals(Object obj)
//toString()

class Value {
	int value;
	String name;
	
	public Value(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
//		첫번째 방법:
//		if(this.value == ((Value)obj).value)
//			return true;
//		else 
//			return false;
		
//		두번째 방법:
//		Value v = (Value)obj;
//		if(this.value == v.value)
//			return true;
//		else
//			return false;
		
//		세번째 방법: (위의 if문을 연산자로도 가능)
		return this.value == ((Value)obj).value ? true : false;
	}
	
	@Override
	public String toString() {
		return "[value: " + value + ", name: " + name + "]";
	}
}

public class EqualsTest2 {

	public static void main(String[] args) {

		Value v1 = new Value(10 , "kim");
		Value v2 = new Value(10, "lee");
		
		System.out.println("== : " + (v1 == v2));
		System.out.println("equals : " + v1.equals(v2)); //equals오버라이딩전에는 false (객체를 생성한 클래스를 참조하기 때문), 오버라이딩을 통해 재정의해야함! 

		System.out.println("---------------------------");
		System.out.println(v1.toString()); //toString오버라이딩전에는 주소값출력, 오버라이딩을 통해 재정의해야함!
		System.out.println(v2.toString());
	}

}

/* (실행 결과:)

== : false
equals : true
---------------------------
[value: 10, name: kim]
[value: 10, name: lee]

*/
