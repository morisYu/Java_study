package chap14.sec05.art06;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};

		Consumer<Member> consumerB = m -> {
			System.out.println("consumerB: " + m.getId());
		};

		// Consumer 종류의 함수적 인터페이스는 리턴값이 없기 때문에 andThen() 디폴트
		// 메소드는 함수적 인터페이스의 호출 순서만 정한다.
		// 아래 코드는 consumerA를 먼저 처리하고 consumerB를 처리한다.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", new Address("daegu", "dongu")));
	}
}
