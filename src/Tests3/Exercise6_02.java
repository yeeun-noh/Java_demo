package Tests3;
//SutdaCard2클래스에 두개의 생성자와 info()를 추가해서 실행결과 얻기:

public class Exercise6_02 {

	public static void main(String[] args) {	
		SutdaCard2 card1 = new SutdaCard2(3, false);
		SutdaCard2 card2 = new SutdaCard2();
		
		System.out.println(card1.info()); //3
		System.out.println(card2.info()); //1K
	}

}

class SutdaCard2 {
	int num;
	boolean isKwang;

	public SutdaCard2() {
		this(1, true);
	}
	
	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(isKwang == true) return num + "K";
		else return num + "";
	}
}
