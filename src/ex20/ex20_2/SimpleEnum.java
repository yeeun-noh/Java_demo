package ex20_2;
//열거형 (enums)
//- ordinal()

enum Animal {
	DOG, CAT	// 0, 1
}

enum Person {
	MAN, WOMAN	// 0, 1
}

public class SimpleEnum {

	public static void main(String[] args) {
		
		System.out.println(Animal.CAT);
		System.out.println(Animal.CAT.ordinal()); //ordinal(): 열거형 상수가 정의된 순서를 반환

		who(Person.MAN);
	}

	public static void who(Person p) {
		switch (p) {
		case MAN :
			 System.out.println("남성");
			 break;
		case WOMAN :
			System.out.println("여성");
			break;
		}
	}
}

/* (실행 결과:)

CAT
1
남성

*/
