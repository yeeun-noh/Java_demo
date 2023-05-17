package ex;
//for문을  while문으로 변경하기:

public class Exercise4_05 {

	public static void main(String[] args) {
		//for문:
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("= while문 사용 =");
		
		//while문:
		int i = 0;
		int j = 0;
		
		while(i <= 10) {
			i++;
			while(j <= 10) {
				j++;
				if(i>=j)
					System.out.print("*");
			}
			System.out.println();
			j = 0;
		}
	}

}
