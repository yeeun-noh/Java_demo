package Tests3;
//정의된 메서드를 작성하고 테스트하기:

public class Exercise6_24 {
	public static int abs(int value) {
		if(value < 0) value = -value;
		return value;
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}

}
