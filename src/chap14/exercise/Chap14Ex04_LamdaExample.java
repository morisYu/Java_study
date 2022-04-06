package chap14.exercise;

import java.util.function.IntSupplier;

public class Chap14Ex04_LamdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {

			// 메소드 내에서 메소드의 매개변수 또는 로컬 변수를 사용할 경우 이 변수는
			// final 특성을 가져야 함(수정할 수 없음)
//			x *= 10;
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
