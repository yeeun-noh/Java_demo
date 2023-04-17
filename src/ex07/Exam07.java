package ex07;

import java.util.Arrays;

public class Exam07 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int count = 1;
		int row = 0, col = -1; //column 0값을 적어주기 위해 -1 부터 시작
		
		int size = 5;
		
		while(size > 0) {
			for(int i=0; i<size; i++) {
				col++;
				arr[row][col] = count++;
			}
			size--;
			if(size == 0) break;
			
			for(int i=0; i<size; i++) {
				row++;
				arr[row][col] = count++;
			}
			
			for(int i=0; i<size; i++) {
				col--;
				arr[row][col] = count++;
			}
			size--;
			if(size == 0) break;

			for(int i=0; i<size; i++) {
				row--;
				arr[row][col] = count++;
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

/* (실행결과:)

1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9	

*/
