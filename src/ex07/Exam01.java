package ex07;

public class Exam01 {
	
	public static void main(String[] args) {
		// 1.배열 10개 생성후 랜덤으로 1~100사이 값을 넣는다.
		// 2.배열 10개 총점과 평균을 구한다
		// 3.배열 10개 최대값, 최소값을 구한다
		// 4.배열 10개 오름차순 정렬을 한다
	
		int[] arr = new int[10];
		
		int sum = 0;
		double average = 0.0;
		int max, min;
		
		System.out.print("랜덤 숫자> ");

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + ", ");
			
			sum += arr[i];
			average = sum / (double)arr.length;
		}
		System.out.println();
		System.out.println("총점: " + sum + ", 평균: " + average);		

		System.out.println("--------------------------------------------------");

		max = min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			else if(arr[i] < min) min = arr[i];
		}
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
		System.out.println("--------------------------------------------------");

		System.out.print("오름차순 정렬: ");

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			} 
			System.out.print(arr[i] + ", ");
		}
	}
}

/* (실행결과:)

랜덤 숫자> 71, 81, 98, 21, 33, 30, 28, 62, 49, 72, 
총점: 545, 평균: 54.5
--------------------------------------------------
최대값: 98, 최소값: 21
--------------------------------------------------
오름차순 정렬: 21, 28, 30, 33, 49, 62, 71, 72, 81, 98,

*/
