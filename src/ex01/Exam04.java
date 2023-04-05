package ex01;

public class Exam04 {

	public static void main(String[] args) {
		
		int num = 8;
		int cnt = 3;
		
		System.out.println(num / cnt); // (몫)2
		System.out.println(num % cnt); // (나머지)2
		
		System.out.println("--------------------------");
		
		// 키보드로 4000을 입력받는다.. 4000초
		// 화면 상 출력
		// 1시간 6분 40초
		int hours = 0;
		int seconds = 60;
		int minutes = 0;
		int input = 4000;
		
		minutes = input / seconds;
		seconds = input % seconds;
		
		if(minutes >= 60)
			hours = 1;
			minutes = minutes - 60;	
		
		System.out.println(input + "초 :");
		System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");
	}

}
