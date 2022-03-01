package chap04.sec02.art03;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 59;
		grade(score);
	}

	public static char grade(int score) {
		char g;
		if (score >= 90) {
			g = 'A';
			System.out.println("점수가 90~100 입니다.");
		} else if (score >= 80) {
			g = 'B';
			System.out.println("점수가 80~90 입니다.");
		} else if (score >= 70) {
			g = 'C';
			System.out.println("점수가 70~80 입니다.");
		} else if (score >= 60) {
			g = 'D';
			System.out.println("점수가 60~70 미만입니다.");
		} else {
			g = 'F';
			System.out.println("점수가 60 미만입니다.");
		}

		System.out.println("등급은 " + g + " 입니다");
		return g;
	}
}
