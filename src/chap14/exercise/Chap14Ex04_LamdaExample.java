package chap14.exercise;

import java.util.function.IntSupplier;

public class Chap14Ex04_LamdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {

			// �޼ҵ� ������ �޼ҵ��� �Ű����� �Ǵ� ���� ������ ����� ��� �� ������
			// final Ư���� ������ ��(������ �� ����)
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
