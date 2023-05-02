package ex19;
// 컬렉션 프레임워크 - Stack
// Stack => 저장:push(), 추출:pop()

// Object peek(): Stack의 맨 위에 저장된 객체를 반환 (꺼내지는 않음) (비어있으면, EmptyStackException발생)
// Object pop() : Stack의 맨 위에 저장된 객체를 꺼냄, 꺼내진후 없어짐 (비어있으면, EmptyStackException발생)
// Object push(Object item): Stack에 객체(item)를 저장함

import java.util.*;

public class StackEx1 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus(); //back.peek()에 "4.다음"이 출력 ==> (Stack은 Last In First Out이기 때문에)

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		
		goURL("5.구글");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back   : " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop()); //forward에서 맨위의 객체를 꺼낸후, back에 저장 
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop()); //back에서 맨위의 객체를 꺼낸후, forward에 저장 
	}
}

/* (실행 결과:)

back   : [1.네이트, 2.야후, 3.네이버, 4.다음]
forward: []
현재화면은 '4.다음' 입니다

= '뒤로' 버튼을 누른 후 =
back   : [1.네이트, 2.야후, 3.네이버]
forward: [4.다음]
현재화면은 '3.네이버' 입니다

= '뒤로' 버튼을 누른 후 =
back   : [1.네이트, 2.야후]
forward: [4.다음, 3.네이버]
현재화면은 '2.야후' 입니다

= '앞으로' 버튼을 누른 후 =
back   : [1.네이트, 2.야후, 3.네이버]
forward: [4.다음]
현재화면은 '3.네이버' 입니다

= 새로운 주소로 이동 후 =
back   : [1.네이트, 2.야후, 3.네이버, 5.구글]
forward: []
현재화면은 '5.구글' 입니다

*/
