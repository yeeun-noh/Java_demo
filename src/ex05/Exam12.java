package ex05;

public class Exam12 {

	public static void main(String[] args) {
		// do-while문
		
		int sum = 0;
		int i = 1;
		
		do {
			System.out.print(i + ", ");
			sum += i;
			i++;
		} while(i<=5);
		
		System.out.println("\nsum= " + sum);
	}

}
