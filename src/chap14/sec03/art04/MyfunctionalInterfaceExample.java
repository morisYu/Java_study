package chap14.sec03.art04;

public class MyfunctionalInterfaceExample {
	public static void main(String[] args) {
		MyfunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(2, 5));

		// return ���� �ִ� ��� �߰�ȣ�� return�� ���� ����
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
