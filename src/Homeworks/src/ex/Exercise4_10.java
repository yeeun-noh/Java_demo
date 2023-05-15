package ex;
//각 자리의 합을 더한 결과를 출력하는 코드
//12345 => (1+2+3+4+5)15 출력

public class Exercise4_10 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
		while(num != 0) {
			sum += (num % 10); //10으로 나눈 나머지를 합에 더함 5
			num -= (num % 10); //1의 결과를 원래의 값에서 뺌 
			num /= 10;	       //10으로 나눔(자리수 줄이기)
		}
		
		System.out.println("sum=" + sum); //1+2+3+4+5 => 15
	}

}
