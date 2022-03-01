package chap04.sec03.art01;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		// 부동소수점 타입(float, double)은 소수점 이하값을 정확하게 표현하지 못함.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			++a;
			System.out.print("float type " + a + " 번 시행: ");
			System.out.println(x);
		}
		System.out.println("----------------------------");
		for (double d = 0.1; d <= 1.0; d += 0.1) {
			++b;
			System.out.print("double type " + b + " 번 시행: ");
			System.out.println(d);
		}
	}
}
