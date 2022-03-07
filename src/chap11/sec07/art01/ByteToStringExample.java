package chap11.sec07.art01;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		char[] chars = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		String str3 = new String(chars);
		System.out.println(str3);
		
		String str4 = new String(bytes, 6, 4);
		System.out.println(str4);
	}
}
