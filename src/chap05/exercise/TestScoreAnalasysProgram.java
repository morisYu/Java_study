package chap05.exercise;

import java.util.Scanner;

public class TestScoreAnalasysProgram {

	public static void main(String[] args) {

		int sumKor = 0;
		int sumEng = 0;
		int sumMat = 0;
		double avgKor = 0.0;
		double avgEng = 0.0;
		double avgMat = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("< 학생 수를 입력하세요 >");
		System.out.print("입력 >");
		int studentNo = scanner.nextInt();

		String[] name = new String[studentNo];
		int[] kor = new int[studentNo];
		int[] eng = new int[studentNo];
		int[] mat = new int[studentNo];
		int[] sum = new int[studentNo];
		double[] avg = new double[studentNo];
		System.out.println();
		System.out.println("< 학생 이름을 입력하세요 >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("입력 >");
			name[i] = scanner.next(); // nextLine은 앞에서 입력한 엔터가 인식됨, 한글은 타이핑 이상해짐
		}

		for (int i = 0; i < studentNo; i++) {
			System.out.println(name[i]);
		}

		System.out.println();
		System.out.println("< 국어점수를 입력하세요 >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("입력 >");
			kor[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("< 영어점수를 입력하세요 >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("입력 >");
			eng[i] = scanner.nextInt();
		}

		System.out.println();
		System.out.println("< 수학점수를 입력하세요 >");
		for (int i = 0; i < studentNo; i++) {
			System.out.print("입력 >");
			mat[i] = scanner.nextInt();
		}

		for (int i = 0; i < studentNo; i++) {
			sumKor += kor[i];
		}
		for (int i = 0; i < studentNo; i++) {
			sumEng += eng[i];
		}
		for (int i = 0; i < studentNo; i++) {
			sumMat += mat[i];
		}
		avgKor = average1point((double) sumKor / studentNo);
		avgEng = average1point((double) sumEng / studentNo);
		avgMat = average1point((double) sumMat / studentNo);
		System.out.println();
		System.out.println("< 반 성적 통계 >");
		System.out.println("국어합계: " + sumKor + " / 영어합게: " + sumEng + " / 수학합계: " + sumMat);
		System.out.println("국어평균: " + avgKor + " / 영어평균: " + avgEng + " / 수학평균: " + avgMat);
		System.out.println();
		System.out.println("----------------\n");
		System.out.println("< 개인 성적 통계 >");
		for (int i = 0; i < studentNo; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
		}
		for (int i = 0; i < studentNo; i++) {
			avg[i] = average1point((double) sum[i] / 3);
		}
		for (int i = 0; i < studentNo; i++) {
			System.out.println("이름: " + name[i] + " / 국어: " + kor[i] + " / 영어: " + eng[i] + " / 수학: " + mat[i]
					+ " / 합계: " + sum[i] + " / 평균: " + avg[i]);
		}
		System.out.println();
		System.out.println("----------------\n");
		// 석차
		int maxS = 0;
		String maxN = new String();
		int x = 0;

		for (int i = 0; i < studentNo; i++) {
			maxS = sum[i];
			x = i;
			for (int j = i; j < studentNo; j++) {
				if (maxS < sum[j]) {
					maxS = sum[j];
					maxN = name[j];
					x = j;
				}
			}
			int tmpS = sum[i];
			String tmpN = name[i];
			sum[i] = maxS;
			name[i] = maxN;
			sum[x] = tmpS;
			name[x] = tmpN;
		}
		for (int i = 0; i < studentNo; i++) {
			System.out.println(name[i] + " : " + sum[i]);
		}

		System.out.println();
		System.out.println("----------------\n");

	}

	public static double average1point(double avg) {
		int a = (int) (avg * 100);
		int b = (int) (avg * 10) * 10;
		if (a - b >= 5) {
			avg = (double) (a + 10) / 100;
		} else {
			avg = (double) b / 100;
		}
		return avg;
	}

}
