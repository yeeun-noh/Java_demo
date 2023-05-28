package Tests3;
//정의된 변수들을 종류별로 구분:
/*
- 클래스변수(staitc변수)	: width, height
- 인스턴스변수			: kind, num
- 지역변수				: k, n, card
*/

class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}
}
public class Exercise6_08 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1,1);
	}

}
