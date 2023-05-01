package ex16_4;
//java.lang패키지 :
//equals(Object obj)

class Member {
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override //m1.equals(m2)
	public boolean equals(Object obj) { //여기서 obj는 m2를 받아줌		
		if(this.id == ((Member)obj).id) //여기서 this는 m1을 받아줌 (line45에서 m1이 equals를 호출했기때문)
			//설명:
			//Object obj = new Object();	//Object클래스는 상위클래스이므로 id 접근/사용 못함
			//Member m1 = (Member)obj;	//형변환
			//m1.id;
			//(m1 == (Member)obj)이므로 =>  m1.id; == ((Member)obj).id;
			return true;
		else 
			return false;

//		이렇게 사용도 가능 :
//		Member m = (Member)obj;
//		if(this.id == m.id)
//			return true;
//		else 
//			return false;
	}
}

public class EqualsTest {

	public static void main(String[] args) {

		Member m1 = new Member("test");
		Member m2 = new Member("test");
		
		String s1 = new String("test2"); 
		String s2 = new String("test2");
		
		
		System.out.println("== : " + (m1 == m2));
		System.out.println("equals : " + m1.equals(m2)); //오버라이딩전에는 false (객체를 생성한 클래스를 참조하기 때문), 오버라이딩을 통해 재정의해야함! 
		
		System.out.println("== : " + (s1 == s2));
		System.out.println("equals : " + s1.equals(s2)); //true => (String은 equals를 바로 사용가능!), (line38과 비교)

	}

}

/* (실행 결과:)

== : false
equals : true
== : false
equals : true

*/
