package ex20_1;
//Map - HashMap
//- put(), get(), clear(), remove(), ketSet(), entrySet(), getKey(), getValue(), Collection values()

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("김자바", new Integer(90)); //(key, value)
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet(); //entrySet(): key와 value를 엔트리(key와 value의 결합)의 형태로 Set에 저장해서 반환
		System.out.println(set);
		System.out.println("-----------------------------------------");
				
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
		System.out.println("-----------------------------------------");
		
		set = map.keySet(); //keySet(): 모든key가 저장된 Set을 반환
		System.out.println("참가자 명단: " + set);
		System.out.println("-----------------------------------------");
		
		Collection values = map.values(); //Collection values(): 모든 value를 컬력센의 형태로 반환
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (float)total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));
	}

}

/* (실행 결과:)

[안자바=90, 김자바=100, 강자바=80, 이자바=100]
-----------------------------------------
이름: 안자바, 점수: 90
이름: 김자바, 점수: 100
이름: 강자바, 점수: 80
이름: 이자바, 점수: 100
-----------------------------------------
참가자 명단: [안자바, 김자바, 강자바, 이자바]
-----------------------------------------
총점: 370
평균: 92.5
최고점수: 100
최저점수: 80

*/
