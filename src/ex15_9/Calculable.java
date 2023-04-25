package ex15_9;

public interface Calculable {
//	void calculate(int x);
	int calculate(int x);
}

class Test implements Calculable {

	@Override
	public int calculate(int x) {
		return x*x*x;
	}
	
}
