package chap11.sec09.art01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringBuilderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader stb = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str1 = stb.readLine();
		StringTokenizer st = new StringTokenizer(str1," ");
		
		sb.append(st.nextToken()+" ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("ÃÑ ¹®ÀÚ¼ö: " + length);

		String result = sb.toString();
		System.out.println(result);
	}
}
