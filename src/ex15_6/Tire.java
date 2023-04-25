package ex15_6;

public class Tire {		
	public void roll() {
		System.out.println("타이어가 굴러갑니다");
	}
}

class Test extends Tire {
	public void roll() {
		System.out.println("Tire 상속받아 재정의");
	}
}
