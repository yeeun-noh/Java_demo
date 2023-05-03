package ex20;
//Set - HashSet

import java.util.HashSet;
import java.util.Set;

class Num {
	private int num;
	
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num); //num + ""
	}
	
	@Override
	public int hashCode() {
		return num%3;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else return false;
//		위랑 동일:
		return num == ((Num)obj).num ? true : false;
	}
}

public class HashSetCollection2 {

	public static void main(String[] args) {

		Set<Num> set = new HashSet<>(); //Set은 중복저장X, 순서X
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(20));
		set.add(new Num(20));
		
		for(Num n: set)
			System.out.println(n);		
	
		System.out.println("-----------------------");
//		로또번호 만들기 예제 :
		Set<Integer> set2 = new HashSet<>();
		for(int i=0; set2.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(num);
		}

		for(int s: set2)
			System.out.print(s + ", ");

	}

}

/* (실행 결과:)

10
20
-----------------------
32, 9, 10, 42, 11, 45, (랜덤수)

*/
