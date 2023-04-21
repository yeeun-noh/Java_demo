package ex13;
//리뷰 (ex12/Exam03.java)

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Exam02 {
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for(int i=0; i<arr.length; i++)
			action(arr[i]);
		
		System.out.println("---------------------------");
		// 또다른방법:
		action(new DanceRobot());
		action(new SingRobot());
		action(new DrawRobot());
	
	}
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dd = (DanceRobot)r;
			dd.dance();
		} else if(r instanceof SingRobot) {
			SingRobot ss = (SingRobot)r;
			ss.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
}


/* (실행결과:)

춤을 춥니다.
노래를 합니다.
그림을 그립니다.
---------------------------
춤을 춥니다.
노래를 합니다.
그림을 그립니다.

*/
