package chap11.sec12.art02;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// �ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// ���� �� �ڵ� UnBoxing
		int value = obj;
		System.out.println("value: " + value);

		// ���� �� �ڵ� UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
