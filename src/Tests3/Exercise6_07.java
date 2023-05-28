package Tests3;
//클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의:

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//인스턴스메서드 getDistance() 작성:
	double getDistance(int x1, int y1) {
		int d1 = (x1-x)*(x1-x);
		int d2 = (y1-y)*(y1-y);
		return Math.sqrt(d1+d2);
	}
}
public class Exercise6_07 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		//p와 (2,2)의 거리를 구한다:
		System.out.println(p.getDistance(2,2));
	}

}
