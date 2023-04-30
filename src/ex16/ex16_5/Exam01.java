package ex16_5;
//아래 pioint클래스와 Rectangle클래스에 내용비교를 위한 equals메서드를 각자 삽입하자
//그리고 정의한 equals 메서드의 확인을 위한 main메서드 직접 구현하자

class Point {
	private int xPos;
	private int yPos;
	
	public Point(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.xPos == ((Point)obj).xPos && this.yPos == ((Point)obj).yPos)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos= " + yPos + "]";
	}
}

class Rectangle {
	private Point upperLeft;  //좌측상단 좌표
	private Point lowerRight; //우측하단 좌표
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		Point p = (Point)obj;
		
		if(this.lowerRight == p.r.lowerRight)
				return true;
		else
			return false;
	}
	
	
	@Override
	public String toString() {
		return "Point [upperLeft=" + upperLeft + ", lowerRight= " + lowerRight + "]";
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));

	
		Rectangle r1 = new Rectangle(50, 50, 10, 10);
		Rectangle r2 = new Rectangle(50, 50, 10, 10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.equals(r2));
	}

}
