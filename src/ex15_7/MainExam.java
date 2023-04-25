package ex15_7;

public class MainExam {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		
//		home.use2(이자리는 RemoteControl의 구현객체가 와야함);
		home.use2(new RemoteControl() { //재정의
			
			@Override
			public void turnOn() {
				System.out.println("오디오 전원 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오 전원 끕니다");
			}
		});
	}

}
