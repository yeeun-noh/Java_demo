package Tests;
//두 개의 주사위 눈의 합이 6이 되는 모든경우의 수:

public class Exercise4_06 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++)
				if((i+j)==6) {
					count++;
					System.out.println(i + " + " + j + " = " + (i+j));
				}
		}
		System.out.println("경우의 수: " + count);
	}

}
