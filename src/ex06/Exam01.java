package ex06;

public class Exam01 {

	public static void main(String[] args) {
		// (Test)
		// 조원3명 자바점수를 입력 받아서
		// 자바 점수 배점은 랜덤함수를 이용해서 50~100값이 저장되도록 한다
		// 조원 총점, 평균을 출력

		int sum = 0;
		double average = 0;
		int a, b, c = 0;

		a = (int)(Math.random()*(100-50 + 1))+50; // 50~100값구하는법 : (int)Math.random()*(최댓값 - 최소값 +1) + 최솟값
		b = (int)(Math.random()*(100-50 + 1))+50;
		c = (int)(Math.random()*(100-50 + 1))+50;
		System.out.print(a + ", " + b + ", " + c);

		sum = a + b + c;
		average = sum /3.0;
		System.out.println("\n총점= " + sum + ", 평균= " + average);
	}

}
