package ex15_8;

//public class Add implements Calculable {
//	
//	@Override
//	public void calculate(int x, int y) {
//		System.out.println("x+y: " + (x+y));
//	}
//}

class Substract implements Calculable {

	@Override
	public void calculate(int x, int y) {
		System.out.println("x-y: " + (x-y));
	}
	
}
