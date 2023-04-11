package ex05;

public class Exam04 {

	public static void main(String[] args) {
		// 구구단
		// (for문)
		for(int i=2; i<=9; i++)
			for(int j=1; j<=9; j++)
				System.out.printf("%d x %d = %2d%n", i, j, i*j);

		System.out.println("\n----------------\n");

		// (while문)
		int i = 2;
		int j = 1;
		
		while(i<=9) {
			j = 1;
			while(j<=9) {
				System.out.printf("%d x %d = %2d%n", i, j, i*j);
				j++;
			}
			i++;
		}
	}

}
