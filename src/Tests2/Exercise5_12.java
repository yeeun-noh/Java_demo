package Tests2;

import java.util.Scanner;

//예제5-23 변경:

public class Exercise5_12 {

	public static void main(String[] args) {

		String[][] words = {
				{"chair","의자"},		 //words[0][0], words[0][1]
				{"computer","컴퓨터"}, 	//words[1][0], words[1][1]
				{"integer","정수"}	 //words[2][0], words[2][1]
		};
		
		int score = 0; //맞춘 문제의 수를 저장하기 위한 변수
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
				score++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.%n", words.length, score);
	}

}
