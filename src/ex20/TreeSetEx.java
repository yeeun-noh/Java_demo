package ex20;
//Set - TreeSet

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>(); //TreeSet은 자동정렬됨, 중복저장은X
		
		set.add(10);
		set.add(8);
		set.add(2);
		set.add(15);
		set.add(5);
		set.add(10);
		
		System.out.print(set);
	}

}

/* (실행 결과:)

[2, 5, 8, 10, 15]

*/
