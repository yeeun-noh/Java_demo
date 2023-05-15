package ex;
//희문수(palindrome)를 구하는 프로그램
//희문수(palindrome): 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수(ex. 12321, 13531, ...)

public class Exercise4_15 {

	public static void main(String[] args) {
		//hint: 나머지 연산자 이용
		int number = 12321;
		int tmp = number;
		
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp != 0) {
//
		}
		
		if(number == result)
			System.out.println(number + "는 희문수 입니다.");
		else
			System.out.println(number + "는 희문수가 아닙니다.");
	}

}
