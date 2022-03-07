package chap11.sec13.art02;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("���� ��ȣ: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();

		// ��÷��ȣ
		int[] winningNumber = new int[6];
		// Random ��ü ���� �� �õ� ���� ���� �ٸ� �������� ��µ�(�õ尡 ������ ���� ������ ���)
		random = new Random(5);
		System.out.print("��÷ ��ȣ: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();

		// ��÷����
		Arrays.sort(selectNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ����: ");
		if (result) {
			System.out.println("1 � ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
}