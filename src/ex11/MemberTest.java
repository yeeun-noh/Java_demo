package ex11;
// 클래스간의 관계 - 포함관계
// 상속 (~은 ~이다)
// 포함 (~은 ~를 가지고 있다)

class Bag {
	int capacity;
	SunCream sun;					//포함관계
	SunCream sun2 = new SunCream(); 	//포함관계
	
	public Bag() {
		System.out.println("Bag()");
	}
	
	void move() {
		System.out.println("가방 옮기다");
	}
}

class SunCream {
	int vol;
	
	public SunCream() {
		System.out.println("SunCream()");
	}
	
	void cover() {
		System.out.println("선크림을 바르다");
	}
}

public class MemberTest {

	public static void main(String[] args) {

		Bag b = new Bag();
		b.sun = new SunCream();
		b.move();
		b.sun.cover();
		b.sun2.cover();
	}

}

/* (실행결과:)

Bag()
SunCream()
가방 옮기다
선크림을 바르다
선크림을 바르다

 */
