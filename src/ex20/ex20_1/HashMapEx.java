package ex20_1;
//Map - HashMap
//- put(), get(), clear(), remove(), ketSet(),

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(5, "Kim"); //add()대신 put()사용!  => map.put(key, value);
		map.put(10, "Park");
		map.put(9, "Lee");
		map.put(10, "Hong");
		map.put(8, "Park");
		map.put(1, "Kim");
		
		System.out.println(map);
		System.out.println(map.get(9)); //key(9)의 값, value("Lee")출력!
//		map.clear();
		map.remove(9);
		System.out.println(map);
		System.out.println("--------------------------");
		
		Set<Integer> set = map.keySet(); //keySet(): 모든key가 저장된 Set을 반환
		System.out.println(set); //set은 key
		for(int n : set) { 
			System.out.println(n);
		}
		System.out.println("--------------------------");

		for(int n : set) {
			System.out.println(map.get(n)); //get(Object key): key의 값(객체, value)를 반환, 못찾으면 null반환
		}
	}

}

/* (실행 결과:)

{1=Kim, 5=Kim, 8=Park, 9=Lee, 10=Hong}
Lee
{1=Kim, 5=Kim, 8=Park, 10=Hong}
--------------------------
[1, 5, 8, 10]
1
5
8
10
--------------------------
Kim
Kim
Park
Hong

*/
