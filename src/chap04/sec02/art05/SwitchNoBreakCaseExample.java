package chap04.sec02.art05;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간: " + time + "시");
		/*
		 * 각 케이스별로 break가 없으면 해당 케이스에서부터 break가 나올 때까지 case문이 전부 실행됨.
		 */
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");

		}
	}
}
