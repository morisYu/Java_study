package chap04.sec02.art05;

public class SwitchStringExample {
	public static void main(String[] args) {
		/* 
		 * switch 문에서 실수타입(float, double) 변수 사용 불가
		 */
		String position = "과장";

		switch (position) {
		case "부장":
			System.out.println("700 만원");
			break;
		case "과장":
			System.out.println("500 만원");
			break;
		default:
			System.out.println("300 만원");
		}
	}
}
