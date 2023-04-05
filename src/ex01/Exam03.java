package ex01;

public class Exam03 {

	public static void main(String[] args) {

		int num = 10;
		int sum = 0;
		int tmp = 0;
		
		tmp = ++num; //num=11, tmp=11 (++num => num=11 => num을 tmp에 대입 => tmp=11)
		sum = num++; //sum=11, num=12 (num을 먼저 sum에 대입 => sum=11 => num++ => num=12)
		
		System.out.println(tmp); //11
		System.out.println(num); //12
		System.out.println(sum); //11
	}

}
