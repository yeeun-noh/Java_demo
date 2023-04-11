package ex05;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 +++++
		 +++++
		 +++++
		 행(세로) : i = 3
		 열(가로) : j = 5
		*/

		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++)
				System.out.print("+");
			System.out.println();
		}
		// 순서: i가 0일때 j=0,1,2,3,4 => (+++++) => println()
		// => i가 1일때 j=0,1,2,3,4 => (+++++) => println()
		// => i가 2일때 j=0,1,2,3,4 => (+++++) => println()
		// => i가 3일때 j=0,1,2,3,4 => (+++++) => println()
		// => i가 4일때 j=0,1,2,3,4 => (+++++) => println()
	}

}
