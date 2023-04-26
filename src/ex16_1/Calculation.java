package ex16_1;
//리뷰

public interface Calculation {
	int calculate(int x, int y);
}

//일반적인 인터페이스 구현할때만 사용:
class Add implements Calculation {
	@Override
	public int calculate(int x, int y) {
		return x+y;
	}
}
class Sub implements Calculation {
	@Override
	public int calculate(int x, int y) {
		return x-y;
	}
}
class Mul implements Calculation {
	@Override
	public int calculate(int x, int y) {
		return x*y;
	}
}
class Div implements Calculation {
	@Override
	public int calculate(int x, int y) {
		return x/y;
	}
}
