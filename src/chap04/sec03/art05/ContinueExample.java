package chap04.sec03.art05;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // ¦���� �ƴ� ���(2�� ����� �������� 0�� �ƴ� ��)
				continue;
			}
			System.out.println(i);
		}
	}
}
