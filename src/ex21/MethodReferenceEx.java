package ex21;
// 메서드 참조 (Method Reference) - 람다식을 간략히 가능!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceEx {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
//		ls.add(10); //에러, 수정 불가능
		ls = new ArrayList<>(ls);
		ls.add(11);
		System.out.println(ls);
		
//		Consumer<T> - accept() 사용:
//		Collections.reverser() 사용:
//		
//		Consumer<List<Integer>> c = t -> Collections.reverse(t);
//		위의 람다식을 간략히 == (메서드 참조):
		Consumer<List<Integer>> c = Collections::reverse;
		c.accept(ls);
		System.out.println(ls);
	}

}

/* (실행 결과:)

[1, 3, 5, 7, 9, 11]
[11, 9, 7, 5, 3, 1]

*/
