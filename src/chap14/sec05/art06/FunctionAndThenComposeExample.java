package chap14.sec05.art06;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		// 매개값 Member로부터 Address 를 리턴한다.
		Function<Member, Address> functionA;
		// 매개값  Address로부터 String 을 리턴한다.
		Function<Address, String> functionB;
		// 매개값 Member로부터 String 을 리턴한다.
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		// functionA의 결과값인 Address 가 functionB의 매개값으로 대입되고
		// functionB의 결과값인 String 이 리턴된다.
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: "+city);
		
		// compose() 는 andThen() 과 순서가 반대이다.
		// compose() 안에있는 functionA 의 결과값이 compose() 앞에있는 functionB
		// 의 매개값으로 대입되고 functionB의 결과값인 String 이 리턴된다.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "hong", new Address("한국", "서울")));
		System.out.println("거주 도시: "+city);
	}
}
