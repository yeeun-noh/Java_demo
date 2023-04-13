package ex07;

import java.util.Arrays;

public class Exam02 {
	
	public static void main(String[] args) {
		// 배열의 복사:
		
		// arrNum의 배열크기가 5개라서 부족하다...10개로 증가하고싶다...
		int[] arrNum = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arrNum)); // [10, 20, 30, 40, 50]
		
		int[] arrNum2 = new int[10];
		
		for(int i=0; i<arrNum.length; i++) 
			arrNum2[i] = arrNum[i]; //arrNum의 값을 하나씩 하나씩 arrNum2으로 복사 (빈곳은 0으로 자동 초기화됨)

		System.out.println(Arrays.toString(arrNum2)); // [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
		
		System.out.println("----------------------------------------------------------------");
		
		// 배열의 복사는 아님(주소값을 이용해 같은 배열을 가르키게 되는것!)
		int[] tmp = new int[10];
		tmp = arrNum; // arrNum의 주소값을 tmp에게 복사 (한번에 arrNum의 값들이 저장됨) => 따라서 arrNum와 tmp는 같은 배열공간을 창조(같은 배열을 가리키게 됨)
		System.out.println(Arrays.toString(tmp)); // [10, 20, 30, 40, 50]
		
		// 위의 문장들이 맞게 나왔는지 확인해보기(랜덤값을 지정해서 출력해보기): 
		arrNum[3] = 100;
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(tmp));
		
		System.out.println("----------------------------------------------------------------");

		//'System.arraycopy()' 이용해서 배열의 복사: 
		int[] arr = {10, 20, 30, 40, 50};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length); // arr의 첫번째위치부터의 값을 arr2의 첫번째위치자리부터 시작해서 arr.length갯수만큼 복사

		System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50]
		System.out.println(Arrays.toString(arr2)); // [10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
	}
}

/* (실행결과:)

[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]
----------------------------------------------------------------
[10, 20, 30, 40, 50]
[10, 20, 30, 100, 50]
[10, 20, 30, 100, 50]
----------------------------------------------------------------
[10, 20, 30, 40, 50]
[10, 20, 30, 40, 50, 0, 0, 0, 0, 0]

*/
