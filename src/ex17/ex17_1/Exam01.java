package ex17_1;
//java.lang패키지
//getClass()

class Card {
	void info() {
		System.out.println("card()");
	}
}

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {

//		Card card = new Card();
//		card.info();
		
//		Class cObj = new Card().getClass(); //클래스의 경로 알수 있음
//		Class cObj = Card.class;			//클래스의 경로 알수 있음
//		Class cObj = Class.forName("ex17_1.Card");
//		Object obj = Class.forName("ex17_1.Card");
		
		
//String 클래스의 생성자와 메서드:
		String str = "kor"; //immutable(변셩 불가능한) 객체
		System.out.println(str);
		str = "korea";
		System.out.println(str);
		
		//.compareTo()
		System.out.println("a".compareTo("a")); //같으면 0 반환  (0)
		System.out.println("a".compareTo("b")); //사전적으로 이전이면 음수를, 이후면 양수를 반환 (-1)
		System.out.println("a".compareTo("A")); //사전적으로 이전이면 음수를, 이후면 양수를 반환 (32)
		
		//.contains()
		System.out.println(str.contains("r")); //true
		
		//.indexOf()
		System.out.println(str.indexOf("r")); //2
		
		//.replace()
		String str2 = str.replace("ko", "KO");
		System.out.println(str2); //(KOrea)
		
		//.split(String regx) : 문자열을 지정된 분리자(regx)로 나누어 문자열 배열에 담아 반환
		String study = "kor,eng,math";
		String[] arr = study.split(","); //"kor,eng,math"을 ","로 나누어 arr에 저장=> arr[0]="kor", arr[1]="eng", arr[2]="math"
		for(String a : arr)
			System.out.println(a);
		//split실행결과:
		//kor
		//eng
		//math
	
		//.substring(int begin, int end) : (begin <= x < end)범위의 문자열 반환
		System.out.println(str.substring(1, 3)); //(or)
		
		//.trim() : 앞뒤 공백제거(중간에 있는 공백은 제거X)
		String str3 = " hi iam Java    ";
		System.out.println(str3.trim()); //(hi iam Java)
		
		//String.valueOf() : 저장된 값을 문자열로 변환하여 반환
		String ss = String.valueOf(100);
		System.out.println(ss); //정수100이 아닌 문자열"100"을 반환 (100) 
	
	
		//join()
		String animals = "dog,cat,bear";
		String[] arrAnimals = animals.split(",");
		String str4 = String.join("-", arrAnimals);
		System.out.println(str4); //(dog-cat-bear)


//Wrapper클래스: (기본형을 객체로 바꿔줌)
		Object obj1 = 10; //obj에 주소값만 받을수있는데 정수가 들어갔으므로 에러가 떠야함=>(자동적으로 형변환)
		Object obj2 = new Integer(10);
		
		String s = "10";
		int num = Integer.parseInt(s);
		Object o = Integer.parseInt(s);
		Object o2 = Integer.valueOf(s);

		System.out.println(num);
		System.out.println(o);
		System.out.println(o2);

		
//오토박싱 & 언박싱:
//		오토박싱 : 기본형값 -> 래퍼클래스의 객체 (자동변환해줌)
//		언박싱 :  기본형값 <- 래퍼클래스의 객체 (자동변환해줌)
		int i = 5;
		Integer iObj = new Integer(7);
		int sum = i + iObj; //원래는 기본형과 참조형간의 연산은 불가능 하지만, 컴파일러가 자동으로 변환하는 코드를 넣어줌으로써 가능해짐
//		(윗문장을 컴파일러가 자동변환 해줌:)(언박싱!)
//		=>  int sum = i + iObj.intValue();
//		intValue()는 Integer객체를 int타입의 값으로 변환해줌! 
		System.out.println(sum); //(12)
	}

}
