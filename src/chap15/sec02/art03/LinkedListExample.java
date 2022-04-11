package chap15.sec02.art03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// ArrayList �� ���� �迭�� ��ü�� �����ؼ� �ε����� ����
		// Ư�� �ε����� ��ü�� �����ϸ� ���� ��ü�� �ε����� 1�� ������ �����
		List<String> list1 = new ArrayList<String>();
		// LinkedList �� ���� ������ ��ũ�ؼ� ü��ó�� ����
		// Ư�� �ε����� ��ü�� �����ϸ� �յ� ��ũ�� ����ǰ� ������ ��ũ�� ������� ����
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;

		// �������� ��ȸ�� ArrayList �� ����
		for (int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		startTime = System.nanoTime();
		list1.get(5000);
		endTime = System.nanoTime();
		System.out.println("ArrayList �˻��ð�: " + (endTime - startTime) + " ns");

		for (int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		startTime = System.nanoTime();
		list2.get(5000);
		endTime = System.nanoTime();
		System.out.println("LinkedList �˻��ð�: " + (endTime - startTime) + " ns");

		// �������� �߰�, ������ ����� ��� LinkedList �� ó���ӵ��� ����.
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList ó���ð�: " + (endTime - startTime) + " ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList ó���ð�: " + (endTime - startTime) + " ns");
	}
}
