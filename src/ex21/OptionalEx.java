package ex21;
//Optional<T>
//Optional<T>객체를 생성할때는 of()나 ofNullable() 사용
// - get() : Optional객체에 저장된 값을 가져옴
// - orElse()

import java.util.Optional;


public class OptionalEx {

	public static void main(String[] args) {

//		Optional<T> 와 of() 사용:
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.of(new String("Toy2"));

//		get() 사용:
		if(os1.isPresent())
			System.out.println(os1.get());
		else
			System.out.println(os1.orElse("No..."));
		
	}

}

/* (실행 결과:)

Toy1

*/
