package ex15_5;
//중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서!

public class Button {
	
	public static interface ClickListener {
		void onClick(); //추상메서드 - 반드시 구현
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) { //구현한 객체의 주소값을 받음
		this.clickListener = clickListener;
	}
	
	public void click() { //Button이 출력되었을 때 실행되는 메서드 선언
		this.clickListener.onClick(); //구현한 메서드를 실행
	}
 
}
