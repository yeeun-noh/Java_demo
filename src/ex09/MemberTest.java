package ex09;

class Member {
	String name;
	String id; //인스턴스변수 id
	String password;
	int age;

	boolean login(String id, String password) { //지역변수(매개변수) id
		if(id.equals("hong") && password.equals("12345") ) return true;
		else return false;
	};
	
	void logout(String id){
		System.out.println(id + " 님이 로그아웃 되었습니다");
	};
}

public class MemberTest {
	
	public static void main(String[] args) {
		Member m = new Member();
		
		boolean b = m.login("ho", "123");
		if(b == true) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
		boolean b2 = m.login("hong", "12345");
		if(b2 == true) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
		m.logout("hong");

//		내가 한 방법: 
//		m.id = "hong";
//		m.password = "12345";
//		System.out.println(m.login(m.id, m.password)); //true
//		m.logout(m.id); //hong 님이 로그아웃 되었습니다

	}
	
}
