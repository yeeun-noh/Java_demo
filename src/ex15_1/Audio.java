package ex15_1;

//RemoteControl 인터페이스 구현2:
public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}
	
	//디폴트메서드 재정의:
	//(default => public)으로 바꿔서 사용하기:
	public void setMute(boolean mute) {
		System.out.println("setMute() 제정의 합니다");
	}

}
