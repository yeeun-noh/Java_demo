package ex21;
//Optional<T>
//if else

import java.util.Optional;

class ContactInfo {
	private String phone;
	private String address;

	public ContactInfo(String phone, String address) {
		this.phone = phone;
		this.address = address;
	}
	
	public String getPhone( ){
		return phone;
	}
	
	public String getAddree( ){
		return address;
	}
}

public class OptionalEx2 {

	public static void main(String[] args) {

//		ContactInfo c1 = new ContactInfo("010", null);		
//		String phone;
//		String address;
//		
//		if(c1.getPhone() != null)
//			phone = c1.getPhone();
//		else
//			phone = "No phone!";
//			
//		if(c1.getAddree() != null)
//			address = c1.getAddree();
//		else
//			address = "No address!";
//		
//		System.out.println(phone);
//		System.out.println(address);
			
		Optional<ContactInfo> c1 = Optional.of(new ContactInfo("010", null));
		String phone = c1.map(c-> c.getPhone()).orElse("No phone!");
		String address = c1.map(c-> c.getAddree()).orElse("No address!");
		
		System.out.println(phone);
		System.out.println(address);
	}
	

}

/* (실행 결과:)

010
No address!

*/
