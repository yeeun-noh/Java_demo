package ex16_2;
//예외처리 (exception handling)
//메서드에 예외 선언하기 (throws 사용)

public class Exam04 {

	public static void main(String[] args) {

		try {
			findClass();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");
	}
	
	private static void findClass() throws ClassNotFoundException {

		Class.forName("java.lang.String2");
	}

}

/* (실행 결과:)

java.lang.ClassNotFoundException: java.lang.String2
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at ex16_2.Exam04.findClass(Exam04.java:19)
	at ex16_2.Exam04.main(Exam04.java:10)
[프로그램 종료]

*/
