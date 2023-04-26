package ex16_2;
//예외처리 (exception handling)
//try-catch문 + finally블럭

public class Exam03 {

	public static void main(String[] args) {
		
		String[] arr = {"100", "abc", "300"};
		System.out.println("[프로그램 시작]");

		for(int i=0; i<arr.length+1; i++) {
			try {
				int value = Integer.parseInt(arr[i]);
				System.out.println(value);
			} catch(ArrayIndexOutOfBoundsException e) { //i<arr.length+1이므로
				e.printStackTrace();
				System.out.println("> 배열의 크기를 벗어났습니다");
			} catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("> 숫자가 아닌 문자는 숫자로 변환 불가합니다");
			} catch(Exception e) { //이 문장은 첫번째로 가게 되면 Exception이 ArrayIndexOutOfBoundsException 와 NumberFormatException을 이미 포함하기 때문에 마지막에 실행 (Exception은 모든 예외의 최고조상이므로!)
				System.out.println(">>모든 예외 처리는 내가한다");
			} finally {
				System.out.println("!!예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 여기다가 기입!!");
			}
		}
		System.out.println("[프로그램 종료]");
	}

}

/* (실행 결과:)

[프로그램 시작]
100
!!예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 여기다가 기입!!
java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at ex16_2.Exam03.main(Exam03.java:14)
> 숫자가 아닌 문자는 숫자로 변환 불가합니다
!!예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 여기다가 기입!!
300
!!예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 여기다가 기입!!
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at ex16_2.Exam03.main(Exam03.java:14)
> 배열의 크기를 벗어났습니다
!!예외가 발생하든 발생하지 않든 무조건 처리해야 되는 문장은 여기다가 기입!!
[프로그램 종료]

*/
