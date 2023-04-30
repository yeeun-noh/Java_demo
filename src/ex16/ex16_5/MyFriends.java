package ex16_5;
//보강

class UnivFriend { //대학동창
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String name, String major, String phone) {
		super();
		this.name = name;
		this.major = major;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UnivFriend [name=" + name + ", major=" + major + ", phone=" + phone + "]";
	}
}

class ComFriend { //직장동료
	private String name;
	private String department;
	private String phone;
	
	public ComFriend(String name, String department, String phone) {
		super();
		this.name = name;
		this.department = department;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ComFriend [name=" + name + ", department=" + department + ", phone=" + phone + "]";
	}
}

//친구 전화목록 클래스
public class MyFriends {
	
	public static void main(String[] args) {
		
		//대학동창 관리하는 배열
		UnivFriend[] univFriends = new UnivFriend[5];
		int uCount = 0;
		
		//직장동료 관리하는 배열
		ComFriend[] comFriends = new ComFriend[5];
		int cCount = 0;

		univFriends[uCount++] = new UnivFriend("Kim", "business", "010-1111-1111");
		univFriends[uCount++] = new UnivFriend("Park", "computer", "010-2222-2222");
		for(int i=0; i<uCount; i++)
			System.out.println(univFriends[i]);
		
		System.out.println("------------------------------------------------------------");
		
		comFriends[cCount++] = new ComFriend("Lee", "accounting", "010-3333-3333");
		comFriends[cCount++] = new ComFriend("Hong", "development", "010-4444-4444");
		for(int i=0; i<cCount; i++)
			System.out.println(comFriends[i]);
	}
}



