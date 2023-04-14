package ex07;

public class Exam06 {
	
	public static void main(String[] args) {

		int[][] score = {
						{100, 100, 100},
						{20, 20, 20},
						{30, 30, 30},
						{40, 40, 40},
						{50, 50, 50}
					};
		
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점   평균  ");
		System.out.println("=============================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			// 총점 구하기:
			korTotal  += score[i][0];
			engTotal  += score[i][1];
			mathTotal += score[i][2];
			
			// 번호 구하기:
			System.out.printf("%2d", i+1);
			
			// 각점수 구하기:
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			//총점, 평균 구하기: 
			avg = sum / (float)score[i].length; 
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=============================");
		System.out.printf("총점: %3d, %4d, %4d%n", korTotal, engTotal, mathTotal);
	}
}

/* (실행결과:)

번호  국어  영어  수학  총점   평균  
=============================
 1  100  100  100  300 100.0
 2   20   20   20   60  20.0
 3   30   30   30   90  30.0
 4   40   40   40  120  40.0
 5   50   50   50  150  50.0
=============================
총점: 240,  240,  240

*/
