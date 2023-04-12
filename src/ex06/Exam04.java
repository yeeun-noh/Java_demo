package ex06;

public class Exam04 {

	public static void main(String[] args) {
		// (Test)
		// 1. int 배열 10개 생성
		// 2. 랜덤함수 이용해서 10개 초기화
		// 3. 최대값, 최소값 출력
		
		int[] arr = new int[10];
		int max, min;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + ", ");
		}
	
		// 최대값과 최소값을 첫번째 값으로 초기화
		max = arr[0];
		min = arr[0];
		
		// 배열의 두번째 요소부터 읽기위해 i의 값을 1로 초기화 (0+1)
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최대값: " + max + ", 최소값: " + min);
	}

}
