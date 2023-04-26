package ex16_5;
//보강

class Friends {
	private String name;
	private String phone;
	
	public Friends(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + ", phone=" + phone;
	}
}

class UnivFriend2 extends Friends { //대학동창
	private String major;
	
	
	public UnivFriend2(String name, String major, String phone) {
		super(name, phone); //'super()' 항상 첫문장에 실행!
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [" + super.toString() + ", major=" + major + "]";
	}
}

class ComFriend2 extends Friends { //직장동료
	private String name;
	private String department;
	private String phone;
	
	public ComFriend2(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
	}

	@Override
	public String toString() {
		super.toString();
		return "ComFriend [" + super.toString() + ", department=" + department + "]";
	}
}

//친구 전화목록 클래스
public class MyFriends2 {
	
	public static void main(String[] args) {
		
		Friends[] friends = new Friends[10];
		int fCount = 0;
		
		friends[fCount++] = new UnivFriend2("Kim", "business", "010-1111-1111");
		friends[fCount++] = new UnivFriend2("Park", "computer", "010-2222-2222");
		friends[fCount++] = new ComFriend2("Lee", "accounting", "010-3333-3333");
		friends[fCount++] = new ComFriend2("Hong", "development", "010-4444-4444");
		for(int i=0; i<fCount; i++)
			System.out.println(friends[i]);
	}
}
