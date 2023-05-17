package ex;
//Math.random()를 이용해 1~6 사이의 임의의 정수를 변수 value에 저장하는 코드:

public class Exercise4_07 {

	public static void main(String[] args) {
		
		int value = (int)(Math.random()*6)+1;
		
		System.out.println("value: " + value);
	}

}
