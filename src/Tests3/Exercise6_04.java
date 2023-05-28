package Tests3;
//Student2클래스에 두개의 메서드 getTotal()과 getAverage()를 추가해서 실행결과 얻기:

public class Exercise6_04 {

	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return Math.round(getTotal()/3f *10)/10f;
	}
}