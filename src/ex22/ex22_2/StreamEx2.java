package ex22_2;
//스트림(Stream)
// - mapToInt()

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


class ToyPriceInfo {
	private String model;
	private int price;
	
	public ToyPriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}

public class StreamEx2 {

	public static void main(String[] args) {

		List<ToyPriceInfo> list = new ArrayList<>();
		
		list.add(new ToyPriceInfo("GUN_LR_45", 200));
		list.add(new ToyPriceInfo("GUN_LR_55", 600));
		list.add(new ToyPriceInfo("TEDDY_BEAR_S_914", 350));
		list.add(new ToyPriceInfo("CAR_TRANSFORM_VER_778", 550));
		
//		1. 장난감 가격이 500이상 제품의 합 출력:
		Stream<ToyPriceInfo> stm1 = list.stream();
		int sum = stm1.filter(n-> n.getPrice() >= 500).mapToInt(n-> n.getPrice()).sum();
		//위의 두문장을 한문장으로 합치기 가능:
		int sum2 = list.stream().filter(n-> n.getPrice() >= 500).mapToInt(n-> n.getPrice()).sum();
		
		System.out.println("가격이 500이상 제품의 합: " + sum);
		System.out.println("가격이 500이상 제품의 합: " + sum2);
	}

}

/* (실행 결과:)

가격이 500이상 제품의 합: 1150
가격이 500이상 제품의 합: 1150

*/
