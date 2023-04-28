package ex15_1;

//재귀호출:
public class FactorialTest {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		int result = 0;
		
		if(n == 1)
			return 1;
		else
			result = n * factorial(n-1);
		
		return result;
	}

}
