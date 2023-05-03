package ex20;
//Iterator
//- hasNext(), next(), remove()

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
//		for( String str : list)
//			System.out.println(str);
		
//		Iterator사용:
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {		//hasNext(): 읽어올 요소가 남아있으면 true, 아니면 false
			String st = it.next();	//next(): 다음요소를 읽어옴 (hasNext()를 먼저 호출해서 읽어올 요소가 있는지 확인)
			System.out.println(st);
		}
		
		System.out.println("--------------");
		
//		반복문을 더 하고 싶을때 iterator를 한번더 호출:
		it = list.iterator();
		while(it.hasNext()) {
		//	String st = it.next();
		//	System.out.println(st);
			System.out.println(it.next()); //간단히 가능
		}
		
		
//		"Box"만 삭제:
		it = list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("Box"))
				it.remove();		//remove(): next()로 읽어온 요소를 삭제
		}
		
		System.out.println("--------------");
		
//		반복문을 더 하고 싶을때 iterator를 한번더 호출:
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

/* (실행 결과:)

Toy
Box
Robot
Box
--------------
Toy
Box
Robot
Box
--------------
Toy
Robot

*/
