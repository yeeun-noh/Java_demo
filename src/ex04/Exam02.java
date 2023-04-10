package ex04;

public class Exam02 {

	public static void main(String[] args) {
		//(Test)
		// 1부터 100까지의 홀수 갯수구하기
    
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 != 0) {
				count++;
			}
		}
		System.out.println("첫번째 방법: 1부터 100까지의 홀수 갯수: " + count);
		
		// 또 다른 방법 :
		count =0;
		for(int i=1; i<=100; i+=2) { // i=i+2
				count++;
		}
		System.out.println("두번째 방법: 1부터 100까지의 홀수 갯수: " + count);
	}

}
