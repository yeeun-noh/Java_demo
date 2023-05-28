package Tests3;
//두 점의 거리를 계산하는 getDistance()를 완성하기:
//HINT: 제곱근 계산은 Math.sqrt(double a) 사용

public class Exercise6_06 {
	//두 점(x,y)와 (x1,y1)간의 거리를 구한다:
	static double getDistance(int x, int y, int x1, int y1) {
		int d1 = (x1-x)*(x1-x);
		int d2 = (y1-y)*(y1-y);
		return Math.sqrt(d1+d2);
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
