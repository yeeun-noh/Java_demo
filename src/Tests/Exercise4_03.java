package Tests;
//1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+10)의 결과 구하기:

public class Exercise4_03 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=10; i++) {
		    for(int j=1; j<=10; j++) {
		        if(i >= j)
		            sum += j;
		    }
		}
		System.out.println(sum);
	}
	
}
