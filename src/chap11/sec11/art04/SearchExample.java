package chap11.sec11.art04;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		// �⺻ Ÿ�԰� �˻�
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);

		// ���ڿ� �˻�
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);

		// ��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m3);
		System.out.println("ã�� �ε���: " + index);
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
