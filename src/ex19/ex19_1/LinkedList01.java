package ex19_1;
// 컬렉션 프레임워크 - LinkedList

import java.util.LinkedList;
import java.util.Collections;


public class LinkedList01 {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);	//[10, 20, 30]
		
		int num1 = list1.peek();	//peek() : LinkedList의 첫번째요소를 반환
		System.out.println(num1);	//10
		System.out.println(list1);	//[10, 20, 30]
		
		int num2 = list1.poll();	//poll() : LinkedList의 첫번째요소를 반환(LinkedList에서는 제거됨)
		System.out.println(num2); 	//10
		System.out.println(list1);	//[20, 30]
	}

}

/* (실행 결과:)

[10, 20, 30]
10
[10, 20, 30]
10
[20, 30]

*/
