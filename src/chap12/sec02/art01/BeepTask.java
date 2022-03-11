package chap12.sec02.art01;

import java.awt.Toolkit;

// Runnable 인터페이스를 구현
// 이 구현객체를 매개값으로 Thread 생성자를 호출해야 작업스레드가 생성됨
public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
