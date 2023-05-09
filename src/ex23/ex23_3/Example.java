package ex23_3;

import ex23_3.Button.ClickListener;

class Button {
	//정적 멤버 인터페이스(함수형 인터페이스)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListender(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}



public class Example {
	public static void main(String[] args) {
		Button btnOk = new Button();
		//익명객체 사용:
		btnOk.setClickListender(new ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		});				
		btnOk.click();
		
		Button btnCancel = new Button();
		//람다식사용:
		btnCancel.setClickListender(() -> System.out.println("Cancel 버튼을 클릭했습니다"));
		btnCancel.click();
	}
}
