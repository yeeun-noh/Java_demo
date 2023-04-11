package ex05;

public class Exam08 {

	public static void main(String[] args) {
		// break문 = 자신이 포함된 가장 가까운 반복문을 벗어남
		// continue문 = 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감 
		
		int sum = 0;
		int i = 0;
		
		System.out.print("sum= ");
		while(true) {
			sum += i;
			i++;
			
			System.out.print(sum + ", ");
			
			if(sum > 100) break;
		}
		System.out.println("\n프로그램 종료");
		
		System.out.println("-----------------------------------------------");

		System.out.print("홀수= ");
		for(int j=1; j<=10; j++) {
			if(j%2 == 0) continue; //continue문을 만나며 라인9번째(반복문)로 돌아가 계속 수행
			
			System.out.print(j + ", ");
		}
		System.out.println("\n프로그램 종료");
	}

}

//	(실행결과 :)
//
//	sum= 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105, 
//	프로그램 종료
//	-----------------------------------------------
//	홀수= 1, 3, 5, 7, 9, 
//	프로그램 종료
