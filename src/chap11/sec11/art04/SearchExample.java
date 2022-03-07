package chap11.sec11.art04;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		// ±âº» Å¸ÀÔ°ª °Ë»ö
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);

		// ¹®ÀÚ¿­ °Ë»ö
		String[] names = { "È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);

		// °´Ã¼ °Ë»ö
		Member m1 = new Member("È«±æµ¿");
		Member m2 = new Member("¹Úµ¿¼ö");
		Member m3 = new Member("±è¹Î¼ö");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m3);
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name= " + members[i].name);
		}
	}
}

class Member implements Comparable<Member>{
	String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		
		return name.compareTo(o.name);
	}
}
