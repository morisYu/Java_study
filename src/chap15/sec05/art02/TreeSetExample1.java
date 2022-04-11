package chap15.sec05.art02;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		// TreeSet�� ����Ʈ���� ��������� Set�÷�����.
		// ��ü�� ã�ų� �˻��� ���õ� �޼ҵ带 ����ϱ� ���� ����.
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		score = scores.first();
		System.out.println("���� ���� ����: " + score);

		score = scores.last();
		System.out.println("���� ���� ����: " + score + "\n");

		int sample = 95;
		score = scores.lower(sample);
		System.out.println(sample + "�� �ٷ� �Ʒ� ����: " + score);

		score = scores.higher(sample);
		System.out.println(sample + "�� �ٷ� ���� ����: " + score + "\n");

		score = scores.floor(sample);
		System.out.println(sample + "�� �̰ų� �ٷ� �Ʒ� ����: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score + "\n");

		while (!scores.isEmpty()) {
			// ���� ���� ��ü�� �������� �÷��ǿ��� ����
			score = scores.pollFirst();
			// ���� ���� ��ü�� �������� �÷��ǿ��� ����
//			score = scores.pollLast();
			System.out.println(score + " (���� ��ü ��: " + scores.size() + ")");
		}
	}
}
