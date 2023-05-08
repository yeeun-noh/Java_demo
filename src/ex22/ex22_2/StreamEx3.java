package ex22_2;
//스트림(Stream)
//- flatMapToInt(), average(), getAsDouble()
//- Stream.of()
import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard {
	private int kor;
	private int eng;
	private int math;
	
	public ReportCard(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
}

public class StreamEx3 {

	public static void main(String[] args) {

		ReportCard[] cards = {
				new ReportCard(70, 80, 90),
				new ReportCard(79, 80, 70),
				new ReportCard(70, 70, 70),
				new ReportCard(90, 90, 100)
		};
		
//		1. 평균 출력:
		//flatMapToInt(): 스트림의 요소가 배열이거나 map()의 연산결과가 배열인경우 (즉, 스트림의 타입이 Stream<T[]> 인 경우) 사용
		//Stream.of(): 이차원 배열일때 사용!
		//average(): 요소의 평균 반환 => double타입
		//getAsDouble() : double타입으로 반환
		IntStream s1 = Arrays.stream(cards).flatMapToInt(r-> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		double average = s1.average().getAsDouble();
		System.out.println("평균: " + average);
		System.out.println("---------------------");
		
		
//		2. 이차원 배열을 1차원 배열로 변환해서 출력:
		int[][] arr = {{10, 20}, {30, 40}, {50, 60}};

		int[] arr2 = {10, 20, 30, 40, 50, 60};
		Arrays.stream(arr).flatMapToInt(t-> Arrays.stream(t)).forEach(s-> System.out.println(s));
	}

}

/* (실행 결과:)

평균: 79.91666666666667
----------------------------
10
20
30
40
50
60

*/
