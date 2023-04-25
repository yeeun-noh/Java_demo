package ex15_1;

//RemoteControl 인터페이스 구현: (다중구현 가능!)
public class Television implements RemoteControl, Searchable{

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다");
	}
	
}
