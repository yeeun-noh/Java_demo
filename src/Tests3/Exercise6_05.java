package Tests3;
//Student3클래스에 생성자와 info()를 추가해서 실행결과 얻기:

public class Exercise6_05 {

	public static void main(String[] args) {
		Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}

}

class Student3 {
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
	
	Student3(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {		
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
}