package chap11.exercise;

import java.util.StringTokenizer;

public class Chap11Ex08_SplitExample {
	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";

		System.out.println("����: " + str);
		System.out.println();
		
		// ���1. split() �޼ҵ� ���
		System.out.println("split() �޼ҵ� ���");
		System.out.println("-------------------");
		String[] strSplit = str.split(",");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(strSplit[i]);
		}
		System.out.println();

		// ���2. StringTokenizer ���
		System.out.println("StringTokenizer ���");
		System.out.println("-------------------");
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
