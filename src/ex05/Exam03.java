package ex05;

public class Exam03 {

	public static void main(String[] args) {
		/*
		 +
		 ++
		 +++
		 ++++
		 +++++
		 행(세로) : i = 5
		 열(가로) : j = ?
		*/
		
		for(int i=0; i<5; i++) { // i=0,1,2,3,4
			for(int j=0; j<i+1; j++) { // j=1,2,3,4,5
				System.out.print("+");
			}
			System.out.println("");
		}

		System.out.println("\n----------------\n");

		/*
		 +++++
		 ++++
		 +++
		 ++
		 +
		*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("+");
			}
			System.out.println("");
		}
		
		System.out.println("\n----------------\n");
		
		/*
		     +
		    ++
		   +++
		  ++++
		 +++++
		*/

		for(int i=0; i<5; i++) { 
			for(int j=0; j<4-i; j++) { // i가 0일때, 4자리까지 빈칸 입력 0,1,2,3 == j<4
				System.out.print(" ");
			}
			for(int j=0; j<5-(4-i); j++) { // i가 0일때, (5-4-0)==마지막자리에 +입력
				System.out.print("+");
			}
			System.out.println();
		}
		
		// 다른 방법 :
		for(int i=0; i<5; i++) { 
			for(int j=0; j<5; j++) {
				if(j<4-i)
				System.out.print(" ");
				else
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println("\n----------------\n");
		
		/*
		 +++++
		  ++++
		   +++
		    ++
		     +
		*/
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("+");
			}
			System.out.println();
		}		
	}

}
