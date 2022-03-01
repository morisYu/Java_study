package chap05.exercise;

// 배열 안에 있는 숫자의 합과 평균을 구하기

public class Chap05Ex08 {
	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count += array[i].length;
		}
		avg = (double) sum / count;
		System.out.println("array Total Length: " + count);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
