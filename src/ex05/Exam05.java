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

		// 구구단
		int k = 2;
		int m = 1;
		
		while(k<=9) {
			m = 1;
			while(m<=9) {
				System.out.printf("%d x %d = %2d%n", k, m, k*m);
				m++;
			}
			k++;
		}
		
		System.out.println("\n----------------\n");

		int j = 5;
		while(j-- != 0) {
			System.out.println(j + " - I can do it");
		}
	}

}
