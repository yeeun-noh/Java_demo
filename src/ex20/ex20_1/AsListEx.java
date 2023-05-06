package ex20_1;
//Arrays
//배열을  List로 변환 - asList(Object... a)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AsListEx {

	public static void main(String[] args) {

//		LinkedList 사용:
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		for(String str: list)
			System.out.println(str);
		System.out.println("-------------------------");

//		asList사용: 
		List<String> list2 = Arrays.asList("Toy2","Box2", "Robot2", "Box2"); //asList(): 배열을 List에 담아서 반환
		
		for(String str: list2)
			System.out.println(str);
		System.out.println("-------------------------");
		
//		list2.add("Toy3"); ==> 불가능:
//		asList()는 반환한 List의 크기를 변경할 수없음 (추가, 삭제 불가능!)
//		=> 밑의 방법사용:
//		ArrayList 사용:
		List<String> list3 = new ArrayList<>(list2);
		list3.add("Toy3");
		
		for(String str: list3)
			System.out.println(str);
	}

}

/* (실행 결과:)
Toy
Box
Robot
Box
-------------------------
Toy
Box
Robot
Box
Toy2
*/
