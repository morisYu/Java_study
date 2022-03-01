package chap04.sec03.art05;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 짝수가 아닌 경우(2로 나누어서 나머지가 0이 아닐 때)
				continue;
			}
			System.out.println(i);
		}
	}
}
