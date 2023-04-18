package ex10;

class Parents {
	public String nation;
	
	public Parents() {
		this("대한민국"); // this() ==> 다른생성자 먼저 호출 ("대한민국"이 밑의 nation에 들어가서 line13 먼저 출력 ==> 그리고 이자리로 돌아와 line8출력)
		System.out.println("Parents() Call");
	}
	
	public Parents(String nation) {
		this.nation = nation;
		System.out.println("Parents(String nation) Call");
	}
}

class Childd extends Parents {
	public String name;
	
	public Childd() {
		//super(); 잠재되있음(상속받기 때문에)
		this("홍길동"); // this() ==> 다른생성자 먼저 호출 ("홍길동"이 밑의 name에 들어가서 line28 먼저 출력 ==> 그리고 이자리로 돌아와 line23출력)
		System.out.println("Childd() Call");
	}
	
	public Childd(String name) {
		//super(); 잠재되있음(상속받기 때문에)
		this.name = name;
		System.out.println("Childd(String name) Call");
	}
}

public class Exam08 {

	public static void main(String[] args) {

		Childd ch = new Childd();
	}

}

/* (실행결과:)

Parents(String nation) Call
Parents() Call
Childd(String name) Call
Childd() Call

 */
