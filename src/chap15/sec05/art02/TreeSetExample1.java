package chap15.sec05.art02;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		// TreeSet은 이진트리를 기반으로한 Set컬렉션임.
		// 객체를 찾거나 검색과 관련된 메소드를 사용하기 위해 사용됨.
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);

		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");

		int sample = 95;
		score = scores.lower(sample);
		System.out.println(sample + "점 바로 아래 점수: " + score);

		score = scores.higher(sample);
		System.out.println(sample + "점 바로 위의 점수: " + score + "\n");

		score = scores.floor(sample);
		System.out.println(sample + "점 이거나 바로 아래 점수: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");

		while (!scores.isEmpty()) {
			// 제일 낮은 객체를 꺼내오고 컬렉션에서 제거
			score = scores.pollFirst();
			// 제일 높은 객체를 꺼내오고 컬렉션에서 제거
//			score = scores.pollLast();
			System.out.println(score + " (남은 객체 수: " + scores.size() + ")");
		}
	}
}
