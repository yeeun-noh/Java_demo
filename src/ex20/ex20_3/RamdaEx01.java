package ex20_3;
//람다식 (Ramda expression)

interface MyFuncton {
	int max(int a, int b); //추상메서드(abstract생략)가 하나만 있을때만 람다식 사용가능
}

//class MyMax implements MyFuncton {
//	@Override
//	public int max(int a, int b) {
//		return a > b ? a: b;
//	}
//}

public class RamdaEx01 {

	public static void main(String[] args) {

//		MyMax m = new MyMax();
//		int num = m.max(10, 20);
//		System.out.println(num);

		MyFuncton m2 = new MyFuncton() { //익명객체
			@Override //어노테이션
			public int max(int a, int b) {
				return a > b ? a: b;
			}	
		};
		System.out.println("max: " + m2.max(10, 20));
	}

}

/* (실행 결과:)

max: 20

*/
