package chap14.sec06.art02;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;

		// String�� �ν��Ͻ� �޼ҵ��� compareToIgnoreCase() �޼ҵ�� �� ���ڿ���
		// ��ҹ��� ������� ������ ���ĺ����� �����Ǿ� �ִ��� ���Ѵ�.
		// ���� ������ a�� b���� �������� ����, ������ 0, �ڿ����� ����� �����Ѵ�.
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java8", "JAVA8"));
		System.out.println(function.applyAsInt("java8", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA8"));
	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("���� ������ ���� �ɴϴ�.");
		} else if (order == 0) {
			System.out.println("������ ���ڿ��Դϴ�.");
		} else {
			System.out.println("���� ������ ���߿� �ɴϴ�.");
		}
	}
}
