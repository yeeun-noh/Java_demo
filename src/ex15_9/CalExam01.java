package ex15_9;

public class CalExam01 {
	
	public static void main(String[] args) {
	
		//인터페이스 구현:
		Calculable cal2 = new Test();
		System.out.println(cal2.calculate(9));
		
		//익명으로 구현했을때(익명구현객체):
		Calculable cal3 = new Calculable() {
			@Override
			public int calculate(int x) {
				return x*x*x;
			}
		};
		System.out.println(cal3.calculate(9));

		//람다식 (함축):
		Calculable cal = x -> x*x*x; //return도 생략가능
		System.out.println(cal.calculate(9));
	}
}
