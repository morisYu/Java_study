package chap06.exercise;

import java.util.Scanner;

public class ScoreArray {
	int number;
	Scanner scanner = new Scanner(System.in);
	int[] score;
	String[] name;

	ScoreArray(int number) {
		this.number = number;
		score = new int[number];
		name = new String[number];
		System.out.println("*****         사용 가능한 Method         *****");
		System.out.println("scoreInput() / scoreSorting() / nameInput()");
		System.out.println("======================");
	}

	void nameInput() {
		System.out.println(number + " 명의 이름을 입력하세요.");
		for (int i = 0; i < number; i++) {
			System.out.print("입력 > ");
			name[i] = scanner.next();
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " 번 이름= " + name[i]);
		}
		System.out.println("======================");
	}

	void scoreInput() {
		System.out.println(number + " 명의 점수를 입력하세요.");
		for (int i = 0; i < number; i++) {
			System.out.print("입력 > ");
			score[i] = scanner.nextInt();
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " 번 점수= " + score[i]);
		}
		System.out.println("======================");
	}

	void scoreSorting() {
		if (score[0] == 0 || name[0] == null) {
			System.out.println("이름/점수를 먼저 입력하세요.");
			return;
		}
		for (int i = 0; i < number; i++) {
			int max = score[i];
			int count = i;
			for (int j = i; j < number; j++) {
				if (max < score[j]) {
					max = score[j];
					count = j;
				}
			}
			int tmp = score[i];
			score[i] = max;
			score[count] = tmp;

			String tmpS = name[i];
			name[i] = name[count];
			name[count] = tmpS;
		}
		System.out.println("======================");
		for (int i = 0; i < number; i++) {
			System.out.println((i + 1) + " 등 이름: " + name[i] + " / 점수: " + score[i]);
		}
		System.out.println("======================");
	}
}
