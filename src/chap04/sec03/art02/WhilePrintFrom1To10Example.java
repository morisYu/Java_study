package chap04.sec03.art02;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		boolean stop = true;
		while (stop) {
			System.out.println(i);
			if (i == 10) {
				stop = !stop;
			}
			i++;
		}
	}
}
