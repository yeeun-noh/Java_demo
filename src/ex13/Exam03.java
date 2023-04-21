package ex13;

public class Exam03 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int  i = 0;
	
	void buy(Product p) {
		if(p.price > money) {
			System.out.println("잔액이 부족하여 " + p + " 을/를 살 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
}
	
	void add(Product p) {		
		if(i >= cart.length) {
			Product[] newCart = new Product[(cart.length)*2];
//			System.arraycopy(cart, 0, newCart, 0, cart.length);
//			cart = newCart;
			
			for(int j =0; j<cart.length; j++) {
				newCart[j] = cart[j];
			}
					cart = newCart;
		}
		cart[i] = p;
		i++;
		
	}
	
	void summary() {
		System.out.print("구입한 물건: ");
			for(int i=0;i<cart.length; i++)
				System.out.print(cart[i] + ",");
		System.out.println();
		System.out.println("사용한 금액: " + (1000 - money));
		System.out.println("남은 금액:" + money);
	}	
}

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString( ) {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString( ) {
		return "Computer";
	}
	
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString( ) {
		return "Audio";
	}
}

/* (실행결과:)

잔액이 부족하여 Computer 을/를 살 수 없습니다.
구입한 물건: Tv,Computer,Tv,Audio,Computer,Computer,
사용한 금액: 850
남은 금액:150

*/
