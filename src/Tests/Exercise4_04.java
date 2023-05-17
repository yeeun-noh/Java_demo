package ex;
//1 + (-2) + 3 + (-4) +... 과 같은식으로 계속 더해갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하기:

public class Exercise4_04 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			int tmp = i++;
//			
//			if(tmp%2 == 0)
//				tmp = -i++;
//			
//			sum += i;
//		}
//		System.out.println(sum);
		
		int i = 0;
		int sum = 0;

		while(true) {
		    i++;
		    if(i%2 == 0) sum -= i;
		    else sum += i;
		    
		    if(sum >= 100) break;
		}
		System.out.println(i);
	}

}
