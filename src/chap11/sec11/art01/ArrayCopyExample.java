package chap11.sec11.art01;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// ���1
		System.out.println("Arrays.copyOf(�����迭, �纻�迭ũ��)");
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "]= " + arr2[i]);
		}
		System.out.println();

		// ���2
		System.out.println("Arrays.copyOfRange(�����迭, ���������ġ, ���糡��ġ(���Ծȵ�))");
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);

		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "]= " + arr3[i]);
		}
		System.out.println();

		// ���3
		System.out.println("arraycopy(�����迭, ���������ġ, �纻�迭, �纻������ġ, ���簳��)");
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr4, 1, 3);

		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]= " + arr4[i]);
		}
		System.out.println();
	}
}
