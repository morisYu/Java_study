package chap14.sec05.art07;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		// 2�� ��� �˻�
		IntPredicate predicateA = a -> a % 2 == 0;

		// 3�� ��� �˻�
		IntPredicate predicateB = b -> b % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		// and() ����Ʈ �޼ҵ� ���
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? " + result);

		// or() ����Ʈ �޼ҵ� ���
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����Դϱ�? " + result);

		// negate() ����Ʈ �޼ҵ� ���
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� 2�� ����� �ƴմϱ�? " + result);
	}
}
