package ex17_1;
//java.util.regex패키지
//정규식 (Regular Expression)

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	public static void main(String[] args) {

		String str = "1111111234567890";	
		Pattern p = Pattern.compile("^[0-9]*$");	//정규식, (숫자만 갯수상관없이(*) 입력가능)
		Matcher m = p.matcher(str);					//str이 정규표현식과 일치하는지 판단
		System.out.println(m.find());//(true)
	
		System.out.println("-----------------------------");
	
		String str2 = "A1234a";
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$"); //(숫자+영어대문자 6개만 입력가능)
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());//(false)
		
		System.out.println("-----------------------------");

		String str3 = "gkdms8517@naver.com";
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com"); //(영어+숫자@영어+숫자.com 형식만 입력가능) (\w: 숫자+영어조합 == [a-zA-Z_0-9])
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());//(true)
		
		System.out.println("-----------------------------");
		
		String str4 = " xbxx";
		Pattern p4 = Pattern.compile("[b|c].{2}"); //string에 아무열이나 세글자중 첫번째 숫자만 b 또는 c이어야함! 
		Matcher m4 = p4.matcher(str4);
		System.out.println(m4.find());//(true)
	}

}
