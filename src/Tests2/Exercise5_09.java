package Tests2;
//배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램:

public class Exercise5_09 {

	public static void main(String[] args) {

		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' },
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } 
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				int i2 = j;
				int j2 = star.length-1-i;
				result[i2][j2]=star[i][j];
			}
		}
// 		=>위의 식을 밑의 식으로도 가능:
// 		for(int i=0; i<star.length; i++) {
// 			for(int j=0; j<star[i].length; j++) {
// 				result[j][i]=star[star.length-i-1][j];
// 			}
// 		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
