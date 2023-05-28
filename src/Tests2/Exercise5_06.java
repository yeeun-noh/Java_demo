package Tests2;
//거스름돈을 몇개의 동전으로 지불할수 있는지를 계산하는 문제
//가능한 한 적은 수의 동전으로 거슬러 주어야함 :

public class Exercise5_06 {

	public static void main(String[] args) {
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다:
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money= " + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int count = money / coinUnit[i];
			System.out.println(coinUnit[i] + "원: " + count);
			
			money = money % coinUnit[i];
		}
	}
	
}
