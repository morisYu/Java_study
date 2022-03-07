package chap11.sec11.art01;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 방법1
		System.out.println("Arrays.copyOf(원본배열, 사본배열크기)");
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]= " + arr2[i]);
		}
		System.out.println();

		// 방법2
		System.out.println("Arrays.copyOfRange(원본배열, 복사시작위치, 복사끝위치(포함안됨))");
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]= " + arr3[i]);
		}
		System.out.println();

		// 방법3
		System.out.println("arraycopy(원본배열, 복사시작위치, 사본배열, 사본시작위치, 복사개수)");
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr4, 1, 3);

		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]= " + arr4[i]);
		}
		System.out.println();
	}
}
