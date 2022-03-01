package chap04.sec03.art02;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 100) {
			sum += i++; // sum에 i를 더해서 대입 후 i는 1 증가
		}
		System.out.println(sum);
	}
}
