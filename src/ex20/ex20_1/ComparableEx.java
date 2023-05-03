package ex20_1;
//Comparable
//- compareTo(Object o)

import java.util.List;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	
//	compareTo() : 반환값은 int이지만 실제로는 비교하는 두객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현해야함
	@Override
	public int compareTo(Person p) {
		return this.age - p.age; //작은거 > 큰거 순 (p.age - this.age는 큰거 > 작은거 순)
	}

}

public class ComparableEx {

	public static void main(String[] args) {
		
//		compareTo를 통해 age 정렬:
		TreeSet<Person> list = new TreeSet<>();
		list.add(new Person("Kim", 20));
		list.add(new Person("Yoon", 28));
		list.add(new Person("Lee", 32));
		list.add(new Person("Park", 22));
		
		for(Person p : list)
			System.out.println(p);
	}

}

/* (실행 결과:)

Kim, 20
Park, 22
Yoon, 28
Lee, 32

*/
