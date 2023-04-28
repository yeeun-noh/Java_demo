package ex15_1;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		//최상위클래스 참조변수이름 = new 구현할클래스();
		RemoteControl rc = new Television();
		rc.turnOn();
		
		//rc가 Audio클래스로 교체:
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		//Audio클래스에서 재정의 했기 때문에 "setMute() 제정의 합니다" 결과 출력:
		rc.setMute(true);
		
		//새로운 interface에 접근하기 위해서는 또다시 참조해야함:
		Searchable se = new Television();
		se.search(null);
		
		System.out.println(RemoteControl.MAX_VOLUMN); //static이기 때문에 클래스명.변수명
		RemoteControl.changeBattery();//static이기 때문에 클래스명.변수명
	}

}
