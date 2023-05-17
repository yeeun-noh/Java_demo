package ex;
//1~8번까지 풀기:

public class Exercise4_01 {

	public static void main(String[] args) {
//		1. int형 변수 x가 10 보다 크고 20 보다 작을 떄 true인 조건식:
		int x = 15;
		boolean flag = true;
		
		if (x>10 && x <20) System.out.println(flag);
		else System.out.println(flag=false);	      
	   
		System.out.println("------------------------------"); 
	      
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식:
		char ch ='a';
		flag = true;
		
		if(!(ch == ' ' || ch =='\t')) System.out.println(flag);
		else System.out.println(flag=false);	      

		System.out.println("------------------------------"); 
	      
//		3. char형 변수 ch가 'x'또는 'X' 일 때  true인 조건식:
		ch = 'x';
		flag = true;

		if(ch == 'x' || ch == 'X' ) System.out.println(flag);
		else System.out.println(flag=false);	      

		System.out.println("------------------------------"); 
	      
//		4. char형 변수 ch가 숫자 ('0'~'9') 일 때 true인 조건식:
		ch = '1';
		flag = true;

		if(ch >= '0' && ch <= '9' ) System.out.println(flag);
		else System.out.println(flag=false);

		System.out.println("------------------------------"); 
	      
//		5. char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식:
		ch = 'a';
		flag = true;

		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) System.out.println(flag);
		else System.out.println(flag=false);
		
		System.out.println("------------------------------"); 
	      
//	    6. int형 변수 year가 400 으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식:
		int year = 2000;
		flag = true;
		
		if((year%400 == 0) || (year%4 == 0) || (year%100 != 0)) System.out.println(flag);
		else System.out.println(flag=false);

		System.out.println("------------------------------"); 
		
//		7. boolen형 변수 powerOn가 false일 때 true인 조건식:
		boolean powerOn = false;
		
		if(powerOn == false) System.out.println(true);
		else System.out.println(false);

		System.out.println("------------------------------"); 
	      
//		8. 문자열 참조변수 str이 "yes"일때 true인 조건식:
		String str = "yes";
		flag = true;
		
		if(str.equals("yes")) System.out.println(flag);
		else System.out.println(flag=false);
	}

}
