package ex15_5;
//중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서!

public class ButtonExam {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
		class OkListener implements Button.ClickListener {
 
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		}
		btnOk.setClickListener(new OkListener());
		btnOk.click();

		
		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
			}
		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
		
		
		Button doubleClick = new Button();
		class DoubleClickListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("더블 클릭했습니다");
			}
		}
		doubleClick.setClickListener(new DoubleClickListener());
		doubleClick.click();
	}
}
