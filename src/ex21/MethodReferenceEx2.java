package ex21;
// 메서드 참조 (Method Reference) - 람다식을 간략히 가능!

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort {
	public void sort(List<?> list) {
		Collections.reverse(list);
	}
}

class A implements Consumer<List<Integer>> {
	@Override
	public void accept(List<Integer> t) {
		JustSort js = new JustSort();
		js.sort(t);
	}
}
public class MethodReferenceEx2 {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
		ls = new ArrayList<>(ls);
		System.out.println(ls);
		
		JustSort js = new JustSort();
//		Consumer<List<Integer>> c = t -> js.sort(t);
//		위의 람다식을 간략히 == (메서드 참조):
		Consumer<List<Integer>> c = js::sort;
		c.accept(ls);
		System.out.println(ls);
		
//		위의 코드를 클래스A를 만들고+재정의해서 사용가능:
//		A a = new A();
//		a.accept(ls);
//		System.out.println(ls);
	}

}

/* (실행 결과:)

[1, 3, 5, 7, 9]
[9, 7, 5, 3, 1]

*/
