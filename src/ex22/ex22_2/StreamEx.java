package ex22_2;
// 스트림(Stream) ==> 람다식 & function패키지(함수형 인터페이스- Supplier<T>, Consumer<T>, Function<T, R>, Predicate<T>), et...) 알아야 수월함!
// - distinct(), filter(), sum(), count(), forEach(), sorted(), map(), mapToInt()

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6}; //배열
//		1. 배열의 짝수합을 구함...단 중복제거:				
		//distinct(): 중복 제거
		//filter(): 조건에 안맞는 요소 제외
		//sum(): 요소의 합을 반환
		IntStream stm1 = Arrays.stream(arr); //배열arr로부터 스트림 생성
		int total = stm1.distinct().filter(n-> n%2 == 0).sum(); //sum()이 최종연산!
		System.out.println("중복 제거후, 짝수의 합: " + total);
		System.out.println();
		
//		2. 배열에서 중복제거후 홀수 개수는 몇개인지 구함:
		stm1 = Arrays.stream(arr);
		//count(): 스트림 요소의 개수를 반환 => long타입
		long total2 = stm1.distinct().filter(n-> n%2 == 1).count(); //count()가 최종연산!
		System.out.println("중복 제거후, 홀수 개수: " + total2);
		System.out.println("---------------------");
		

		String[] names = {"kim", "park", "hong", "lee", "kor", "eng", "math"};
//		1. 이름 출력:
		//forEach(): 각요소에 지정된 작업 수행
		Stream<String> stm2 = Arrays.stream(names);		
		System.out.println("이름 출력: ");
		stm2.forEach(str-> System.out.println(str));
		System.out.println();

//		2. 첫글자 출력:
		stm2 = Arrays.stream(names);
		System.out.println("첫글자 출력: ");
		stm2.distinct().filter(name-> name.startsWith("k")).forEach(str-> System.out.println(str));
		System.out.println();
		
//		3. 글자수가 4글자 이상만 출력:		
		stm2 = Arrays.stream(names);
		System.out.println("글자수가 4글자 이상만 출력: ");
		stm2.distinct().filter(n-> n.length() >= 4).forEach(n-> System.out.println(n));
		System.out.println("---------------------");
		
		
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
//		1. 리스트를 스트림으로 변환후 출력(정렬):
		//sorted(): 스트림의 요소를 정렬
		Stream<String> s = list.stream();
		System.out.println("리스트를 스트림으로 변환후 출력(정렬): ");
		s.sorted().forEach(n-> System.out.println(n));
		System.out.println();
		
//		2. 리스트를 스트림으로 변환후 글자 갯수합 출력:
		//map(): 스트림의 요소를 변환
		s = list.stream();
		long count = s.map(n-> n.length()).count(); //count()=> long타입
		System.out.println("리스트를 스트림으로 변환후 글자 갯수: " + count);
		
		//mapToInt(): 스트림의 요소를 int형으로 변환
		s = list.stream(); //항상 스트림을 쓰고나면, 다시 생성해야함!(스트림은 일회용이기 때문!)
		int sum = s.mapToInt(n-> n.length()).sum(); //sum()=> int타입
		System.out.println("리스트를 스트림으로 변환후 글자 갯수합: " + sum);
		System.out.println("---------------------");
		
//		stream없이 사용(원래 방법):
		boolean t = test(11);
		System.out.println(t);
	}
	
	static boolean test(int n) {
		return n % 2 == 0;
	}

}

/* (실행 결과:)

중복 제거후, 짝수의 합: 12

중복 제거후, 홀수 개수: 3
---------------------
이름 출력: 
kim
park
hong
lee
kor
eng
math

첫글자 출력: 
kim
kor

글자수가 4글자 이상만 출력: 
park
hong
math
---------------------
리스트를 스트림으로 변환후 출력(정렬): 
Box
Robot
Toy

리스트를 스트림으로 변환후 글자 갯수: 3
리스트를 스트림으로 변환후 글자 갯수합: 11
---------------------
false

*/
