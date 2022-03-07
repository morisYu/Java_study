package chap11.sec11.art03;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]= " + scores[i]);
		}
		System.out.println();
		
		String[] names = {"È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö"};
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]= " + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member(99, "È«±æµ¿");
		Member m2 = new Member(97, "¹Úµ¿¼ö");
		Member m3 = new Member(98, "±è¹Î¼ö");
		
		Member[] members = {m1, m2, m3};
		
		// Member.compareTo() ¿¡¼­ name ±âÁØÀ¸·Î °ª ºñ±³
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name= " + members[i].name);
		}
		
	}
}
