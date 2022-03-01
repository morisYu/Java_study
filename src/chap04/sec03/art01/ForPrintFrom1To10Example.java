package chap04.sec03.art01;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		System.out.println("1~30까지 출력");
		for (int i = 1; i <= 30; i++) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		System.out.println("1~30까지 홀수만 출력");
		for (int i = 1; i <= 30; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("------------------------");
		System.out.println("1~30까지 짝수만 출력");
		for (int i = 2; i <= 30; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("시스템 종료");
	}
}
