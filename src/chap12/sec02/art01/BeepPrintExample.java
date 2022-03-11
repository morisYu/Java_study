package chap12.sec02.art01;

import java.awt.Toolkit;

// 비프음을 울리는 것과 프린트 하는 것은 다른 작업이기 때문에 메인 스레드가 동시에 두 작업이 진행되지 않음
public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 비프음을 먼저 발생 후
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		// 프린트 작업 실행
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
