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

		// 시작과 끝 객체 사이의 객체들을 리턴(true/false 여부로 해당 객체를 포함할지 결정)
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "forever", false);

		for (String word : rangeSet) {
			System.out.println(word);
		}
		System.out.println();

		// 주어진 객체보다 낮은 객체들을 리턴(true/false 여부로 해당 객체를 포함할지 결정)
		System.out.println("[f 보다 낮은 단어 검색]");
		NavigableSet<String> lowerSet = treeSet.headSet("f", true);
		for (String word : lowerSet) {
			System.out.println(word);
		}
		System.out.println();

		// 주어진 객체보다 높은 객체들을 리턴(true/false 여부로 해당 객체를 포함할지 결정)
		System.out.println("[f 보다 높은 단어 검색]");
		NavigableSet<String> higherSet = treeSet.tailSet("f", true);
		for (String word : higherSet) {
			System.out.println(word);
		}
	}
}
