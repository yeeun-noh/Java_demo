package ex06;

public class Exam05 {

	public static void main(String[] args) {
		// (Test)
		// Exam04 이어서...
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		System.out.println("오름차순 정렬!!");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
//			for(int j=0; j<arr.length; j++) {	//교환이 많이 일어남
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
