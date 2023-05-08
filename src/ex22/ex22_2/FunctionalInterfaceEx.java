package ex22_2;
//함수형 인터페이스 예시 (스트림을 사용하려면, 함수형 인터페이스 연습!)

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {

		//1.
		BiFunction<Integer, Integer, Integer> f = (a, b)-> a > b ? a: b;
		int num = f.apply(10, 50);
		System.out.println(num);
		
		//2.
		Function<Integer, Integer> f2 = n-> n*n*n;
		System.out.println(f2.apply(4));
		
		//3.
		Predicate<Integer> f3 = n-> n % 2 == 0;
		System.out.println(f3.test(11));
	}

}

/* (실행 결과:)

50
64
false

*/
