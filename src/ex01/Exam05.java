package ex01;

public class Exam05 {

	public static void main(String[] args) {
		
		int jumsu = 80;
		
		String result = null;
		
		// 삼항연산자 or 조건연산자
		result = (jumsu >= 60) ? "합격" : "불합격"; // true면 합격 출력, false면 불합격 출력
		// 조건식 ? 식1(true면 출력) : 식2(false면 출력)
		System.out.println("당신은 " + result + " 입니다");
	}

}
