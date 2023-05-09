package ex23_2;

public class mainTest {

	public static void main(String[] args) {
		Shape r = new Rectangle(75.2, 173.5);
		Shape c = new Circle(10.6);
		
		System.out.printf("사각형 넓이: %.2f%n", r.getArea());
		System.out.printf("원 넓이: %.2f%n", c.getArea());  
 		System.out.println("원 넓이: " + (int)(c.getArea()*100)/100.0);
	}

}

/*

사각형 넓이: 13047.20
원 넓이: 352.99
원 넓이: 352.98

*/
