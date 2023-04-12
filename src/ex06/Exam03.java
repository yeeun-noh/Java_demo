package ex06;

public class Exam03 {

	public static void main(String[] args) {

		int sum = 0;
		
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		
		// 위와 같음
		int[] arrNum = new int[] {10,20,30}; // 배열의 생성과 초기화를 동시에 (new int[] 생략가능)
		
		for(int i=0; i<3; i++) {
			sum += arrNum[i];
		}
		System.out.println(sum);
	}

}
