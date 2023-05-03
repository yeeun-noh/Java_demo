package ex20;
//Set - HashSet

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>(); //Set은 중복저장X, 순서X
		
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("kor");
		set.add("eng");
		
		for(String str: set)
			System.out.println(str);			
	}

}

/* (실행 결과:)

Box
Robot
Toy
kor
eng

*/
