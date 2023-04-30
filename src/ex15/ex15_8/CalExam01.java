package ex15_8;

public class CalExam01 {
	
	public static void main(String[] args) {
		
		//익명구현객체:
		Calculable cal = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("x+y: " + (x+y));
			}			
		};
		cal.calculate(10, 5);
		
		//익명구현객체 (익명클래스를 참조해 바로 재정의):		
		cal = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("x-y: " + (x-y));
			}
		};
		cal.calculate(5, 2);	
		
		//일반객체(class Substract을 참조해 객체생성):
		Calculable cal2 = new Substract();
		cal2.calculate(5, 2);
		
		//람다식은 인터페이스이여야 하고 추상메서드가 하나일때만 가능!
		//람다식 (->) 익명구현객체 축약가능:
		cal = (int x, int y)-> {
				System.out.println("x-y: " + (x-y));
			};
		cal.calculate(5, 2);	
		
		//윗 람다식을 축약: 
		cal = (x, y)-> System.out.println("x-y: " + (x-y));
		cal.calculate(5, 2);	

		//람다식의 또다른 예시:
		cal = (x, y)-> System.out.println("x*y: " + (x*y));
		cal.calculate(5, 2);
	}
}
