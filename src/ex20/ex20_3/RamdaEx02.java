package ex20_3;
//람다식 (Ramda expression)

interface MyFunction2 {
	int max(int a, int b); //추상메서드(abstract생략)
}

public class RamdaEx02 {

	public static void main(String[] args) {

//		MyFuncton2 m2 = new MyFuncton2() { //익명객체
//			@Override //어노테이션
//			public int max(int a, int b) {
//				return a > b ? a: b;
//			}	
//		};
		
//		위의 내용을 람다식 사용:
		MyFunction2 m2 = (a, b)-> a > b ? a: b; //제일 간략히

		System.out.println("max: " + m2.max(10, 20));
	}
}

/* (실행 결과:)

max: 20

*/
