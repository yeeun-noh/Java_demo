package ex05;

public class Exam01 {

	public static void main(String[] args) {
		// 중첩 for문

		for(int i=0; i<3; i++)
			for(int j=0; j<5; j++)
				System.out.println(i + "+" + j);
		// 순서: i가 0일때 j=0,1,2,3,4 => i가 1일때 j=0,1,2,3,4 => i가 2일때 j=0,1,2,3,4
	}

}
