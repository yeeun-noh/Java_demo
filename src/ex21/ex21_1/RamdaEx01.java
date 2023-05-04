package ex21_1;
//람다식 - @FunctionalInterface
//<java.util.function패키지> :
// - BiFunction<T, U, R> -> apply() : 2개의 매개변수(T, U), 1개의 반환값(R)
// - BiConsumer<T, U> -> accpet()   : 2개의 매개변수(T U), 반환값 없음
// - Supplier<T> -> get()	    : 0개의 매개변수, 1개의 반환값(T)
// - Function<T, R> -> apply()      : 1개의 매개변수(T), 1개의 반환값(R)

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface //추상메서드를 하나만 가능하다는것을 의미(람다사용가능)
interface Aaa {
	int max(int a, int b);
//	int max2(int a, int b); //에러, @FunctionalInterface을 붙이게 되면 추상메서드 하나만 사용가능(람다를 사용해야 하기 때문에)
}

@FunctionalInterface
interface Bbb {
	void printVal(String name, int i);
}

@FunctionalInterface
interface Ccc {
	int square(int x);
}

@FunctionalInterface
interface Ddd {
	int roll();
}

@FunctionalInterface
interface Eee {
	int sumArr(int[] arr);
}

public class RamdaEx01 {

	public static void main(String[] args) {

		Aaa aa = (a, b)-> a>b ? a : b;
		System.out.println(aa.max(1, 2));
				
//		BiFunction<T, U, R> -> apply() 사용:
		System.out.println("BiFunction<T, U, R> -> apply() 사용 :");		
		BiFunction<Integer, Integer, Integer> bi = (a, b)-> a>b ? a : b;
		System.out.println(bi.apply(1,2));
		
//		다른예시:
		BiFunction<String, Integer, String> bi2 = (name, age) -> "name: " + name + ", age: " + age;
		System.out.println(bi2.apply("Lee", 28));

		System.out.println("------------------------------------");
		
		Bbb bb = (name, i)-> System.out.println(name + "-" + i);
		bb.printVal("Kim", 20);
		
//		BiConsumer<T, U> -> accpet() 사용:
		System.out.println("BiConsumer<T, U> -> accpet() 사용 :");		
		BiConsumer<String, Integer> bi3 = (name, i)-> System.out.println(name + "-" + i);
		bi3.accept("kim", 20);
		
		System.out.println("------------------------------------");

		Ccc cc = x -> x * x;
		System.out.println(cc.square(3));

//		Function<T, R> -> apply() 사용:
		System.out.println("Function<T, R> -> apply() 사용 :");
		Function<Integer, Integer> f = x -> x * x;
		System.out.println(f.apply(3));

		System.out.println("------------------------------------");

		Ddd dd = ()-> (int)(Math.random()*6);
		System.out.println(dd.roll());

//		Supplier<T> -> get() 사용:
		System.out.println("Supplier<T> -> get() 사용 :");		
		Supplier<Integer> su = ()-> (int)(Math.random()*6);
		System.out.println(su.get());
		
		System.out.println("------------------------------------");

		Eee ee = (int[] arr)-> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(ee.sumArr(arr2));

//		Function<T, R> -> apply() 사용:
		System.out.println("Function<T, R> -> apply() 사용 :");
		Function<int[], Integer> f2 = (int[] arr)-> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		System.out.println(f2.apply(arr2));
	}

}

/* (실행 결과:)

2
BiFunction<T, U, R> -> apply() 사용 :
2
name: Lee, age: 28
------------------------------------
Kim-20
BiConsumer<T, U> -> accpet() 사용 :
kim-20
------------------------------------
9
Function<T, R> -> apply() 사용 :
9
------------------------------------
1
Supplier<T> -> get() 사용 :
0
------------------------------------
15
Function<T, R> -> apply() 사용 :
15

*/
