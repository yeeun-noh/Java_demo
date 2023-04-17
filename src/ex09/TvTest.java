package ex09;

//Tv 클래스 설계
class Tv{
	//멤버변수, 필드
	String colour;	//null
	boolean power;	//false
	int channel;	//0
	
	//메서드, 멤버함수
	void power() { power = !power; }
	void channelUp(){ channel++;}
	void channelDown(){ channel--;}
}

public class TvTest {
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.colour = "검정";
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.colour);	//검정
		System.out.println(tv.channel);	//2
		
		Tv lgTv = new Tv();
		lgTv.colour = "흰색";
		System.out.println(lgTv.colour);	//흰색
		System.out.println(lgTv.channel);	//0
	}
	
}
