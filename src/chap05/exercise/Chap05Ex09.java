package chap05.exercise;

//학생 수와 점수를 입력받아서 최고점수 및 평균점수를 구할 것

import java.util.Scanner;

public class Chap05Ex09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentnum = 0;
		int[] scores = null;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수  | 2.점수입력  | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수를 입력해주세요");
				System.out.print(">>>");
				studentnum = scanner.nextInt();

			} else if (selectNo == 2) {
				System.out.println(studentnum + "명의 점수를 입력해주세요");
				scores = new int[studentnum];
				for (int i = 0; i < studentnum; i++) {
					System.out.print(i + " 번 학생 점수> ");
					scores[i] = scanner.nextInt();
				}

			} else if (selectNo == 3) {
				System.out.println("** 점수 리스트 **");
				for (int i = 0; i < studentnum; i++) {
					System.out.println((i + 1) + " 번 학생: " + scores[i]);
				}

			} else if (selectNo == 4) {
				System.out.println("* 점수를 분석합니다 *");
				if (studentnum == 0) {
					System.out.println("입력된 점수가 없습니다.");
					continue;
				}
				int max = scores[0];
				int sum = 0;
				double avg = 0.0;
				int stunum = 0;
				for (int i = 0; i < studentnum; i++) {
					if (max < scores[i]) {
						max = scores[i];
						stunum = i + 1;
					}
				}
				for (int i = 0; i < studentnum; i++) {
					sum += scores[i];
				}
				avg = (double) sum / studentnum;

				System.out.println("최고 점수: " + max);
				System.out.println("최고 학생: " + stunum + " 번");
				System.out.println("평균 점수: " + halfup(avg));

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Program OFF");
	}

	public static double halfup(double x) {
		int a = (int) (x * 100);
		int b = (int) (x * 10) * 10;
		if (a - b >= 5) {
			x = (double) (b + 10) / 100;
		} else {
			x = (double) b / 100;
		}
		return x;
	}
}
