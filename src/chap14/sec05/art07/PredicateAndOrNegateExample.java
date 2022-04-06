package chap14.sec05.art07;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		// 2의 배수 검사
		IntPredicate predicateA = a -> a % 2 == 0;

		// 3의 배수 검사
		IntPredicate predicateB = b -> b % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		// and() 디폴트 메소드 사용
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);

		// or() 디폴트 메소드 사용
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);

		// negate() 디폴트 메소드 사용
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 2의 배수가 아닙니까? " + result);
	}
}
