package ex23_5;

import java.util.function.Function;

public class Example {

	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg메서드 작성:
	private static double avg(Function<Student, Integer> f) { //함수형인터페이스(Function<T, R> - apply()) 활용!
		int sum = 0;
		for(Student s : students)
			sum += f.apply(s);
		return (double)sum/students.length;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore() );
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore() );
		System.out.println("수학 평균 점수: " + mathAvg);
	}	
}

/*

영어 평균 점수: 92.5
수학 평균 점수: 94.5

*/
