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

		// Consumer ������ �Լ��� �������̽��� ���ϰ��� ���� ������ andThen() ����Ʈ
		// �޼ҵ�� �Լ��� �������̽��� ȣ�� ������ ���Ѵ�.
		// �Ʒ� �ڵ�� consumerA�� ���� ó���ϰ� consumerB�� ó���Ѵ�.
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", new Address("daegu", "dongu")));
	}
}
