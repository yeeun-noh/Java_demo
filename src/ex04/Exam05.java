package ex04;

public class Exam05 {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
		int i, j;
		
		System.out.print("i: ");		
		for(i=1; i<=5; i++) {
			sum += i;  // 누적(+=) : 1 + 2 + 3 + 4 + 5 = 15
			System.out.print(i + ", ");
		}
		System.out.println("\n(i)총합: " + sum);

		
		System.out.print("\nj: ");		
		for(j=1; j<=5; j++) {
			sum2 -= j;  // 차감(-=) : (-1) + (-2) + (-3) + (-4) + (-5) = -15
			System.out.print(j + ", ");
		}
		System.out.println("\n(j)총합: " + sum2);

		System.out.println("---------------------------------------");
		
		//(Test)
		// 1 + (-2) + 3 + (-4) + ..... 이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
		// 이때 i값하고 총합을 출력
		int total = 0;
		int x;

		for(x=0; true; x++) { 	// true 생략 가능
			if(x % 2 == 1)		// 홀수
				total += x;		// 1 + 3 + 5 + ...
			else				// 짝수
				total -= x;  		// (-2) + (-4) + (-6) + ...
					
			if(total >= 100) break;
		}
		System.out.println("x: " + x + ", 총합: " + total);
		
		// 또 다른 방법 :
		int total_ = 0;
		int sign = 1;
		int tmp = 0;
		
		for(int y=1; true; y++,sign=-sign) { // (sign=-sign)는 양수를 정수로 변환
			tmp = sign * y;
			
			total_ += tmp;
			if(total_ >= 100) break;
		}
		System.out.println("x: " + tmp + ", 총합: " + total_);
	}

}

//	(실행결과 :)
//
//	i: 1, 2, 3, 4, 5, 
//	(i)총합: 15
//
//	j: 1, 2, 3, 4, 5, 
//	(j)총합: -15
//	---------------------------------------
//	x: 199, 총합: 100
//	x: 199, 총합: 100
