package ex12;
//다형성

class Unit {
	int x, y;
	void move() {}
	void stop() {}
}

class Marine extends Unit{
	void stimPack(int x, int y) {}
	void move() { 	//오버라이딩
		System.out.println("걸어서 이동");
	}
}

class Tank extends Unit{
	void changeMode(int x, int y) {}
	void move() { 	//오버라이딩
		System.out.println("탱크로 이동");
	}
}

class Dropship extends Unit{
	void load() {/*선택된 대상을 태움*/}
	void unload(int x, int y) {}
	void move() {	//오버라이딩
		System.out.println("배로 이동");
	}
}

class Airplane extends Unit{
	void move() {	//오버라이딩
		System.out.println("날아서 이동");
	}
}

public class Exam02 {

	public static void main(String[] args) {
		
		Marine mr = new Marine();
		mm(mr);

		Tank tr = new Tank();
		mm(tr);
		
		Dropship dr = new Dropship();
		mm(dr);
		
		Airplane ar = new Airplane();
		mm(ar);
	}
	
	static void mm(Unit u) {
		u.move();
	}

}

/* (실행결과:)
 
걸어서 이동
탱크로 이동
배로 이동
날아서 이동

*/
