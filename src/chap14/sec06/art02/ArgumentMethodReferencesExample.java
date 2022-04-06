package chap14.sec06.art02;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;

		// String의 인스턴스 메소드인 compareToIgnoreCase() 메소드는 두 문자열이
		// 대소문자 상관없이 동일한 알파벳으로 구성되어 있는지 비교한다.
		// 사전 순으로 a가 b보다 먼저오면 음수, 같으면 0, 뒤에오면 양수를 리턴한다.
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java8", "JAVA8"));
		System.out.println(function.applyAsInt("java8", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA8"));
	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("사전 순서상 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("사전 순서상 나중에 옵니다.");
		}
	}
}
