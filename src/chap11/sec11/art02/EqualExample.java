package chap11.sec11.art02;

import java.util.Arrays;

public class EqualExample {
	public static void main(String[] args) {
		int[][] original = { { 1, 2 }, { 3, 4 } };

		// 얕은 복사 후 비교
		System.out.println("[얕은 복사 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);

		System.out.println("original: " + original.hashCode());
		System.out.println("cloned1:  " + cloned1.hashCode());
		System.out.println("original[0]: " + original[0].hashCode());
		System.out.println("cloned1[0]:  " + cloned1[0].hashCode());
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		System.out.println();
		
		// 깊은 복사 후 비교
		System.out.println("[깊은 복사 후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		
		System.out.println("original: " + original.hashCode());
		System.out.println("cloned1:  " + cloned2.hashCode());
		System.out.println("original[0]: " + original[0].hashCode());
		System.out.println("cloned1[0]:  " + cloned2[0].hashCode());
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
	}
}
