package chap14.sec05.art06;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		// �Ű��� Member�κ��� Address �� �����Ѵ�.
		Function<Member, Address> functionA;
		// �Ű���  Address�κ��� String �� �����Ѵ�.
		Function<Address, String> functionB;
		// �Ű��� Member�κ��� String �� �����Ѵ�.
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		// functionA�� ������� Address �� functionB�� �Ű������� ���Եǰ�
		// functionB�� ������� String �� ���ϵȴ�.
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: "+city);
		
		// compose() �� andThen() �� ������ �ݴ��̴�.
		// compose() �ȿ��ִ� functionA �� ������� compose() �տ��ִ� functionB
		// �� �Ű������� ���Եǰ� functionB�� ������� String �� ���ϵȴ�.
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("ȫ�浿", "hong", new Address("�ѱ�", "����")));
		System.out.println("���� ����: "+city);
	}
}
