package Tests3;
//컴파일 에러가 발생하는 라인과 그 이유는?

//=> 라인A(static변수초기화에는 static변수만 사용가능, 인스턴스변수 사용불가능),
//=> 라인B(static메서드에서는 static변수만 사용가능, 인스턴스변수 사용불가능),
//=> 라인D(static메서드에서는 static메서드만 호출가능, 인스턴스메서드 호출불가능)

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = iv;		//라인A
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); //라인B
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //라인C
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1();		//라인D
	}

	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();		//라인E
	}
}

public class Exercise6_18 {}
