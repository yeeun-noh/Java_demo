package ex06;

public class Exam02 {

	public static void main(String[] args) {
		// Exam01 참고
		// Array(배열) :
		
		final int MAX = 3;
		int sum = 0;
		double average = 0;

		int[] group = new int[MAX];
		
		for(int i=0; i<MAX; i++)
			group[i] = (int)(Math.random()*(100-50 + 1))+50;
		
		for(int i=0; i<group.length; i++) //MAX대신 group.length 사용가능
			sum += group[i];
			
		average = sum/(double)MAX;

		for(int i=0; i<MAX; i++)
			System.out.print(group[i] + ", ");
		
		System.out.println("\n총점= " + sum + ", 평균= " + average);
	}

}
