package ex19_1;
// 컬렉션 프레임워크 - ArrayList

import java.util.ArrayList;
import java.util.Collections;

class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class ArrayListE01 {

	public static void main(String[] args) {

//		int[] num = new int[5];
//		int[0] = 정수형만;
//		Array는 같은타입만 받아줌
//		ArrayLists는 다른타입도 가능(내부적으로 Object가 받아줌)
		
		//ArrayLists에 <E> 사용해서 형제한 해줘야함:
		//모든 형을 받고싶다면 <Object>넣기!
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(40);
		list1.add(20);
//		list1.add(new String("kor"));
//		list1.add(new Member("Kim", 13));
		
		System.out.println("size: " + list1.size());
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));

		System.out.println("-------------------------");
		Collections.sort(list1);
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
	}

}

/* (실행 결과:)

size: 5
10
30
50
40
20
-------------------------
10
20
30
40
50

*/
