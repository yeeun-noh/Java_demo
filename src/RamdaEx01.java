package ex21_1;
//람다식 (Ramda expression)

interface Aaa {
	int max(int a, int b);
}

interface Bbb {
	void printVal(String name, int i);
}

interface Ccc {
	int square(int x);
}

interface Ddd {
	int roll();
}

interface Eee {
	int sumArr(int[] arr);
}

public class RamdaEx01 {

	public static void main(String[] args) {

		Aaa aa = (a, b)-> a > b ? a : b;
		System.out.println(aa.max(1, 2));
		
		Bbb bb = (name, i)-> System.out.println(name + "-" + i);
		bb.printVal("Kim", 20);
		
		Ccc cc = x -> x * x;
		System.out.println(cc.square(3));
		
		Ddd dd = ()-> (int)(Math.random()*6);
		System.out.println(dd.roll());
		
		Eee ee = (int[] arr)-> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		int[] arr2 = {1, 2, 3};
		System.out.println(ee.sumArr(arr2));		
	}

}
