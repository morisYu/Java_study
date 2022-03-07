package chap11.sec07.art02;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";

		System.out.println("기본 문자셋으로 인코딩");
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		System.out.print("bytes1: ");
		for (int i = 0; i < bytes1.length; i++) {
			System.out.print(bytes1[i]);
			System.out.print(i == (bytes1.length - 1) ? "\n" : ", ");
		}
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		System.out.println("---------------\n");

		try {
			// EUC-KR 문자셋은 알파벳은 1바이트, 한글은 2바이트로 변환
			System.out.println("특정 문자셋으로 인코딩(EUC-KR)");
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			System.out.print("bytes2: ");
			for (int i = 0; i < bytes2.length; i++) {
				System.out.print(bytes2[i]);
				System.out.print(i == (bytes2.length - 1) ? "\n" : ", ");
			}
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String: " + str2);
			System.out.println("---------------\n");

			// UTF-8 문자셋은 알파벳은 1바이트, 한글은 3바이트로 변환
			System.out.println("특정 문자셋으로 인코딩(UTF-8)");
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			System.out.print("bytes3: ");
			for (int i = 0; i < bytes3.length; i++) {
				System.out.print(bytes3[i]);
				System.out.print(i == (bytes3.length - 1) ? "\n" : ", ");
			}
			String str3 = new String(bytes3, "EUC-KR");
			System.out.println("bytes3 -> String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
