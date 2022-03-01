package chap04.sec02.art03;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 1);
		if (num == 1) {
			System.out.println("1 번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2 번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3 번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4 번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5 번이 나왔습니다.");
		} else {
			System.out.println("6 번이 나왔습니다.");
		}
		System.out.println("-----------------");
		System.out.println("추가 로또번호 생성기 실습");
		lottory();
	}

	public static void lottory() {

		int[] lott = new int[6];
		for (int i = 0; i < 6; i++) {
			lott[i] = (int) (Math.random() * 45 + 1);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(lott[i] + "  ");
		}
		System.out.println("+ " + lott[5]);
	}
}
