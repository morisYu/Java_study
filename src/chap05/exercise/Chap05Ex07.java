package chap05.exercise;

// 주어진 배열에서 최대값 구하기
// 추가로 최소값도 구하기

public class Chap05Ex07 {
	public static void main(String[] args) {
		int max = 0; // 배열 안에 있는 숫자보다 크면 안됨
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);

		int min = array[0]; // 배열 안에 있는 숫자보다 작으면 안되기 때문에 배열에 있는 아무 숫자를 대입
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: " + min);
	}
}
