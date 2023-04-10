package ex04;

public class Exam05 {

	public static void main(String[] args) {
		
		int sum2 = 0;
		int sum3 = 0;
		int j, k;
		
		System.out.print("j: ");		
		for(j=1; j<=5; j++) {
			sum2 += j;  // 1 + 2 + 3 + 4 + 5 = 15
			System.out.print(j + ", ");
		}
		System.out.println("\n(j)총합: " + sum2);

		
		System.out.print("\nk: ");		
		for(k=1; k<=5; k++) {
			sum3 -= k;  // (-1) + (-2) + (-3) + (-4) + (-5) = -15
			System.out.print(k + ", ");
		}
		System.out.println("\n(k)총합: " + sum3);

		System.out.println("---------------------------------------");
		
		//(Test)
		// 1 + (-2) + 3 + (-4) + ..... 이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
		// 이때 i값하고 총합을 출력
		int sum = 0;
		int i;

		for(i=0; ;i++) {
			if(i % 2 == 1)		// 홀수
				sum +=i;		// 1 + 3 + 5 + ...
			else				// 짝수
				sum -=i;  		// (-2) + (-4) + (-6) + ...
					
			if(sum >= 100) break;
		}
		System.out.println("i: " + i + ", 총합: " + sum);
	}

}
