package ex20_1;
//Comparable(기본 정렬가준을 구현하는데 사용) - compareTo(Object o)
//Comparator(기본 정렬가준 외에 다른 기준으로 정렬하고자할 때 사용) - compare(Object o1, Object o2)

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Persons { //implements Comparable<Persons>{	//Comparable - compareTo()
	String name;
	int age;
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	
//	compareTo(): 반환값은 int이지만 실제로는 비교하는 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현해야함
	public int compareTo(Persons p) {
		return this.age - p.age; //작은거 > 큰거 순 (p.age - this.age는 큰거 > 작은거 순)
	}
}

class PersonComparator implements Comparator<Persons> {	//Comparator - compare()
//	compare(): 두 객체를 비교해서 음수, 0, 양수 중의 하나를 반환하도록 구현해야함
	@Override
	public int compare(Persons o1, Persons o2) {
		return o1.age - o2.age;
	}
}

public class ComparatorEx {	

	public static void main(String[] args) {
		
		List<Persons> list = new ArrayList<>();
		list.add(new Persons("A", 20));
		list.add(new Persons("D", 50));
		list.add(new Persons("C", 40));
		list.add(new Persons("B", 30));
		
		for(Persons p : list)
			System.out.println(p);
		
//		Collections.sort(list); //기본형자료만 sort
		
		Collections.sort(list, new Comparator<Persons>() {
			@Override
			public int compare(Persons o1, Persons o2) {
				return o1.age - o2.age;
			}
		});
		
//		람다식:
//		Collections.sort(list, (o1, o2)-> o1.age - o2.age);
//		Collections.sort(list, (o1, o2)-> o1.name.length() - o2.name.length());		
		
//		Collections.sort(list, new PersonComparator());
		
		System.out.println("= 정렬후 =");
		for(Persons p : list)
			System.out.println(p);
		
		System.out.println("------------------------------");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(55);
		list2.add(8);
		list2.add(99);
		list2.add(1);
		for(int p : list2)
			System.out.println(p);
		
		System.out.println("= 정렬후 =");
	
		Collections.sort(list2); //기본형자료만 sort
		for(int p : list2)
			System.out.println(p);
	}

}

/* (실행 결과:)

A, 20
D, 50
C, 40
B, 30
= 정렬후 =
A, 20
B, 30
C, 40
D, 50
------------------------------
11
55
8
99
1
= 정렬후 =
1
8
11
55
99

*/
