package ex;
//숫자로 이루어진 문자열의 각 자리의 합을 더한 결과 출력:
//-ex) String 12345 => 1+2+3+4+5 (15출력)

public class Exercise4_09 {

	public static void main(String[] args) {

		String str = "12345";
		int sum = 0;
		int num = Integer.parseInt(str);
		
		while(num !=0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("문자열의 각 자리의 합: " + sum);
	}

}
