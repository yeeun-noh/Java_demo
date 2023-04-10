package ex04;

public class Exam01 {

	public static void main(String[] args) {
		// 반복문 - for문
		
		int count=0;
		
		System.out.print("2와 3의 배수: ");
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
				count++;
			}
		}
		
		System.out.print("\n1~100에서 2와 3의 배수 갯수는: " + count);
	}

}
