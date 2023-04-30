package ex15_6;
//익명클래스(anonymous class)

public class Car {
	
	private Tire tire = new Tire();
	
	//익명자식객체 => 부모클래스를 상속받아 아래같이 생성됨 ( {},구현부가 있다는것은 클래스를 상속받아 재정의한다는 의미 )
	private Tire tire2 = new Tire() {
		public void roll() { //접근 가능
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
		
		public void test() { //접근 불가능
			System.out.println("익명 자식 test");
		}
	};
	
	public void run1() {
		tire.roll();
		tire2.roll();
//		tire2.test(); //=> 이름없는 익명자식객체에서 test메서드는 재정의를 하지 않았기떄문에 호출 불가능
	}
	
	public void run2() {
		Tire tire = new Tire() { // {},구현부가 있다는것은 클래스를 상속받아 재정의한다는 의미
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체2가 굴러감");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
//		tire = new Tire() {
//			@Override
//			public void roll() {
//				System.out.println("익명 자식 Tire 객체3이 굴러감");
//			}
//		};
		tire.roll();
	}
 
}
