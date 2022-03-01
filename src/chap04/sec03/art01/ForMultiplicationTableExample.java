package chap04.sec03.art01;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("***구구단 " + m + "단***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " 곱하기 " + n + " = " + (m * n));
			}
			System.out.println("\n" + "-------------");
		}
	}
}
