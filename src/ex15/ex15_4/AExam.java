package ex15_4;

public class AExam {
	public static void main(String[] args) {
		A a = new A(); //A클래스의 생성자로 감 => line13줄 실행 => B클래스의 생성자로 감 => "B객체 생성"출력 => line14줄로 감 => "A객체 생성"출력
		System.out.println("-----------------");
		a.method();
	}
}
