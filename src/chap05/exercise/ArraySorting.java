package chap05.exercise;

public class ArraySorting {
	public static void main(String[] args) {
		String[] name = { "문길동", "최길동", "박길동", "황길동", "김길동" };
		int[] score = { 90, 50, 70, 60, 40 };
		int maxS = 0;
		int minS = 0;
		String maxN = new String();
		int x = 0;
		int y = 0;

		// 성적 내림차순
		for (int i = 0; i < score.length; i++) {
			maxS = score[i];
			x = i;
			for (int j = i; j < score.length; j++) {
				if (maxS < score[j]) {
					maxS = score[j];
					maxN = name[j];
					x = j;
				}
			}
			int tmpS = score[i];
			String tmpN = name[i];
			score[i] = maxS;
			name[i] = maxN;
			score[x] = tmpS;
			name[x] = tmpN;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i] + " : " + score[i]);
		}

		System.out.println();
		System.out.println("----------------\n");

		// 성적 오름차순
		for (int i = 0; i < score.length; i++) {
			minS = score[i];
			y = i;
			for (int j = i; j < score.length; j++) {
				if (minS > score[j]) {
					minS = score[j];
					y = j;
				}
			}
			int tmpS = score[i];
			String tmpN = name[i];
			score[i] = minS;
			name[i] = name[y];
			score[y] = tmpS;
			name[y] = tmpN;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(name[i] + " : " + score[i]);
		}

		System.out.println("----------------\n");

		int[] array1 = new int[score.length];
		array1 = maxTomin(score);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

	public static int[] maxTomin(int[] array) {
		int[] x = new int[array.length];
		int max = 0;
		int no = 0;
		int tmp = 0;

		for (int i = 0; i < array.length; i++) {
			max = array[i];
			no = i;
			for (int j = i; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
					no = j;
				}
			}
			tmp = array[i];
			array[i] = max;
			array[no] = tmp;
		}
		x = array;
		return x;
	}

}