package ex19_1;
// 컬렉션 프레임워크 - ArrayList와 LinkedListc 장단점 이해:

import java.util.*;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList(2000000);
		LinkedList l1 = new LinkedList();

		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList: " + add1(a1));
		System.out.println("LinkedList: " + add1(l1));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList: " + add2(a1));
		System.out.println("LinkedList: " + add2(l1));
		System.out.println();
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArrayList: " + remove2(a1));
		System.out.println("LinkedList: " + remove2(l1));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList: " + remove1(a1));
		System.out.println("LinkedList: " + remove1(l1));
		System.out.println();
	}

//	결론:
//	순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠름
//	중간데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠름
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}

/* (실행 결과:)

= 순차적으로 추가하기 =
ArrayList: 119
LinkedList: 232

= 중간에 추가하기 =
ArrayList: 2033
LinkedList: 14

= 중간에서 삭제하기 =
ArrayList: 1466
LinkedList: 145

= 순차적으로 삭제하기 =
ArrayList: 9
LinkedList: 33

*/
