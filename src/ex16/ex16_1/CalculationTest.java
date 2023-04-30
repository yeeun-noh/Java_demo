package ex16_1;
//리뷰

public class CalculationTest {
	public static void main(String[] args) {
		//인터페이스 구현:
		Calculation add = new Add();
		System.out.println(add.calculate(4,2));

		Calculation sub = new Sub();
		System.out.println(sub.calculate(4,2));
		
		Calculation mul = new Mul();
		System.out.println(mul.calculate(4,2));
		
		Calculation div = new Div();
		System.out.println(div.calculate(4,2));
		
		
		System.out.println("-----------------------");
		//익명객체구현:
		Calculation add2 = new Calculation() {
			public int calculate(int x, int y) {
				return x + y;
			}
		};
		System.out.println(add2.calculate(4, 2));
		
		Calculation sub2 = new Calculation() {
			public int calculate(int x, int y) {
				return x - y;
			}
		};
		System.out.println(sub2.calculate(4, 2));

		Calculation mul2 = new Calculation() {
			public int calculate(int x, int y) {
				return x * y;
			}
		};
		System.out.println(mul2.calculate(4, 2));

		Calculation div2 = new Calculation() {
			public int calculate(int x, int y) {
				return x / y;
			}
		};
		System.out.println(div2.calculate(4, 2));

		
		System.out.println("-----------------------");
		//람다식으로 구현:
		Calculation add3 = (x, y) -> x+y;
		System.out.println(add3.calculate(4, 2));
		
		Calculation sub3 = (x, y) -> x-y;
		System.out.println(sub3.calculate(4, 2));
		
		Calculation mul3 = (x, y) -> x*y;
		System.out.println(mul3.calculate(4, 2));
		
		Calculation div3 = (x, y) -> x/y;
		System.out.println(div3.calculate(4, 2));
	}
}
