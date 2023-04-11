package ex05;

public class Exam05 {

	public static void main(String[] args) {
		// while문
		
		int i = 0;
		int sum = 0;
		
		while(i<10) {
			i++;
			sum +=i;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("\n----------------\n");

		int j = 5;
		while(j-- != 0) {
			System.out.println(j + " - I can do it");
		}
	}

}
