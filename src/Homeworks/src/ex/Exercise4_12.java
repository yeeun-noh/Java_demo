package ex;
//구구단

public class Exercise4_12 {

	public static void main(String[] args) {		
		for(int i=2; i<9; i=i+3) { 
			for(int j=1; j<4; j++) {
				for(int k=i; k<i+3; k++) {
					System.out.print(k + "*" + j + "=" + (k*j) + "\t");
					if(k==9) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
