package chap15.exercise;

import java.util.TreeSet;

public class Chap15Ex10_TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Chap15Ex10_Student> treeSet = new TreeSet<Chap15Ex10_Student>();

		treeSet.add(new Chap15Ex10_Student("blue", 96));
		treeSet.add(new Chap15Ex10_Student("hong", 86));
		treeSet.add(new Chap15Ex10_Student("white", 92));

		// last() �޼ҵ带 �̿��ؼ� ���� ���� ��ü�� ������� �� �ְ�
		// Chap15Ex10_Student Ŭ�������� compareTo() �޼ҵ� �������̵�
		Chap15Ex10_Student student = treeSet.last();
		System.out.println("�ְ�����: " + student.score);
		System.out.println("�ְ������� ���� ���̵�: " + student.id);

	}
}
