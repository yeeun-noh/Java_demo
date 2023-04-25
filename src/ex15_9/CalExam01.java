package ex15_9;

public class CalExam01 {
	
	public static void main(String[] args) {
	
		//람다식으로 바로:
		Calculable cal = x-> System.out.println("x*3: " + (x*3));
		cal.calculate(9);
	}
}
