package ex19;
// 컬렉션 프레임워크 - Stack & Queue
// Stack => 저장:push(), 추출:pop()
// Queue => 저장:offer(), 추출:poll()

import java.util.*;

public class StackQueueEx1 {

	public static void main(String[] args) {

		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue인터페이스의 구현제인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack ="); //"Last In First Out (LIFO)"
		while(!st.empty())
			System.out.println(st.pop());
		
		System.out.println("= Queue ="); //"First In First Out (FIFO)"
		while(!q.isEmpty())
			System.out.println(q.poll());
	}

}

/* (실행 결과:)

= Stack =
2
1
0
= Queue =
0
1
2

*/
