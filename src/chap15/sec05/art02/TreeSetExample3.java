package chap15.sec05.art02;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		// ���۰� �� ��ü ������ ��ü���� ����(true/false ���η� �ش� ��ü�� �������� ����)
		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "forever", false);

		for (String word : rangeSet) {
			System.out.println(word);
		}
		System.out.println();

		// �־��� ��ü���� ���� ��ü���� ����(true/false ���η� �ش� ��ü�� �������� ����)
		System.out.println("[f ���� ���� �ܾ� �˻�]");
		NavigableSet<String> lowerSet = treeSet.headSet("f", true);
		for (String word : lowerSet) {
			System.out.println(word);
		}
		System.out.println();

		// �־��� ��ü���� ���� ��ü���� ����(true/false ���η� �ش� ��ü�� �������� ����)
		System.out.println("[f ���� ���� �ܾ� �˻�]");
		NavigableSet<String> higherSet = treeSet.tailSet("f", true);
		for (String word : higherSet) {
			System.out.println(word);
		}
	}
}
