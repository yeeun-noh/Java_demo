package ex17_1;
//StringBuffer클래스

public class StringBufferTest {

	public static void main(String[] args) throws ClassNotFoundException {

		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append("23"); //.append() : 문자열을 이어서 추가
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);	//0123456789.0
		System.out.println("sb2= " + sb2);	//0123456789.0
		System.out.println("sb3= " + sb3);	//0123456789.0
		
		System.out.println("sb = " + sb.deleteCharAt(10));	//.deleteCharAt(int n) : n번째자리 삭제 (01234567890)
		System.out.println("sb = " + sb.delete(3, 6));		//.delete(int n, int m) : n이상m미만의 자리 삭제 (01267890)
		System.out.println("sb = " + sb.insert(3, "abc"));	//.insert(int n, string s) : n자리부터 s추가 (012abc67890)
		System.out.println("sb = " + sb.replace(6, sb.length(), "END")); //.replace(int n, int m, String s) : n이상m미만의 자리에 s추가 (012abcEND)
	}

}
