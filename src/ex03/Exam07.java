package ex03;

public class Exam07 {

	public static void main(String[] args) {

		double sample = Math.random();
		// 0.0 <= Math.random() <1.0  : 범위값은 0.0이상 1.0미만 (double만 반환)
		
		// 만약 1이상 10미만의 값을 얻고 싶다면:
		// 10을 곱해주고, int로 변환한뒤 1을 더해주기
		int sample2 = (int)(Math.random()*10) +1;
		
		System.out.println(sample); // double반환
		System.out.println(sample2); // int (정수) 반환
		
//		(실행결과 :)
//		0.8287656282255238
//		8
	}

}
