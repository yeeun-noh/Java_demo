package ex06;

import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		// 로또 프로그램 만들기
		
		int[] lotto = new int[45]; // 숫자 1~45까지
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1; //lotto[0]에 1저장 (숫자1부터 시작하기 때문에)
			
		for(int i=0; i<lotto.length; i++) {
			int num = (int)(Math.random()*45); //lotto[0~44]
			//숫자 45개를 섞기:(중복나올수 없음!)
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;
		}

		System.out.println("로또 번호: ");
			
		for(int i=0; i<6; i++) { // 로또번호 6개니까 [0]~[5]까지의 숫자 출력해주기
			System.out.print(lotto[i] + ", ");
		}
		
		System.out.println("\n--------------------------------------------");
		
		//다른방법:
		int[] num = new int[6];
		
		//랜덤번호 생성
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45) + 1;
			
			//중복번호 제거
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호: \n" + Arrays.toString(num));
	}

}
