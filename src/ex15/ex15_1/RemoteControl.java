package ex15_1;

//인터페이스 선언:
public interface RemoteControl {
	
	//상수 - (public static final)생략가능:
	public static final int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	
	//추상메서드 - (구현부 없음) 구현클래스에서 무조건 구현해야함 (by overriding):
	public void turnOn();
	public void turnOff();
	
	//추상메서드가 아닌 메서드인 경우, default 추가하기:
	//==> 디폴트메서드 - 구현클래스에서 재정의 선택가능
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리 입니다");
		else
			System.out.println("무음처리 해제합니다");
	}
	
	//정적메서드(static메서드) - (public)생략가능:
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
	
}
