package Tests;
//피보나치(Fibonnaci) 수열 : 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55 출력

public class Exercise4_11 {

	public static void main(String[] args) {
		//Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 함:
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //세번째 값
		System.out.print(num1 + "," + num2);
		
		for(int i=0; i<8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			
			num1 = num2;
			num2 = num3; 
		}
	}

}
