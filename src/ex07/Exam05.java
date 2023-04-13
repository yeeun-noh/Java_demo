package ex07;

public class Exam05 {
	
	public static void main(String[] args) {

		int[] n = new int[5];
		
		int[][] num = new int[4][3]; //4행 3열의 2차원 배열 생성
		/*
		0.0   0.1   0.2
		1.0   1.1   1.2
		2.0   2.1   2.2
		3.0   3.1   3.2
		*/
		
		num[2][1] = 100; // (2.1)==3행2열 자리에 100 저장
		System.out.println(num[2][1]); //100
		
		System.out.println("--------------------------------");
		
		int[][] num2 = {
				{1,2,3,4},     //4열  num2[0]
				{4,5,6,7,8},   //5열  num2[1]
				{7,8,9,8,7,6}, //6열  num2[2]
		};
		
		for(int i=0; i<num2.length; i++) {
			for(int j=0; j<num2[i].length; j++) {
				System.out.print(num2[i][j] + ", "); 
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");

		int[][] num3 = new int[4][4];
		int count=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num3[i].length; j++) {
				if(i==j) num3[i][j] = ++count; //++count는 1부터 출력
				System.out.print(num3[i][j] + ", ");
			}
			System.out.println();
		}
	}
}

/* (실행결과:)

100
--------------------------------
1, 2, 3, 4, 
4, 5, 6, 7, 8, 
7, 8, 9, 8, 7, 6, 
--------------------------------
1, 0, 0, 0, 
0, 2, 0, 0, 
0, 0, 3, 0, 
0, 0, 0, 4, 

*/
