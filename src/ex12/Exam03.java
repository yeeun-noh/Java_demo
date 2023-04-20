package ex12;
// instanceof연산자

class Robot {
	void funcR() {}
};

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
	
	void funcR() {
		System.out.println("춤");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
	
	void funcR() {
		System.out.println("노래");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}

	void funcR() {
		System.out.println("그림");
	}
}

public class Exam03 {
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for(int i=0; i<arr.length; i++)
			action(arr[i]);
	}
	
	static void action(Robot r) {
		//instanceof 사용:
		if(r instanceof DanceRobot) { 		//r이 참조하고 있는대상이 DanceRobot이면 true, 아니면 false
			DanceRobot d = (DanceRobot)r;	//-> r의 타입(Robot)을 DanceRobot타입으로 형변환
			d.dance();						//-> dance() 호출
		} else if(r instanceof SingRobot) {	//r이 참조하고 있는대상이 SingRobot이면 true, 아니면 false
			SingRobot s = (SingRobot)r;		//-> r의 타입(Robot)을 SingRobot타입으로 형변환
			s.sing();						//-> sing() 호출
		} else if(r instanceof DrawRobot ) {	//r이 참조하고 있는대상이 DrawRobot이면 true, 아니면 false
			DrawRobot dr = (DrawRobot)r;	//-> r의 타입(Robot)을 DrawRobot타입으로 형변환
			dr.draw();						//-> draw() 호출
		}
	
		//다향성 특성 이용(instanceof 보다 덜 복잡함)
		r.funcR();
	}
  
}

/* (실행결과:)

춤을 춥니다.
춤
노래를 합니다.
노래
그림을 그립니다.
그림

*/
