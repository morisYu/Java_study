package chap11.exercise;

import java.util.StringTokenizer;

public class Chap11Ex08_SplitExample {
	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		System.out.println("원본: " + str);
		System.out.println();
		
		// 방법1. split() 메소드 사용
		System.out.println("split() 메소드 사용");
		System.out.println("-------------------");
		String[] strSplit = str.split(",");
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(strSplit[i]);
		}
		System.out.println();

		// 방법2. StringTokenizer 사용
		System.out.println("StringTokenizer 사용");
		System.out.println("-------------------");
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
