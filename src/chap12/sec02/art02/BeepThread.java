package chap12.sec02.art02;

import java.awt.Toolkit;

// Runnable 의 구현객체가 아닌 Thread의 하위 클래스로 작업 스레드 정의
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.print("동");
			try {
				Thread.sleep(500);

			} catch (Exception e) {

			}
		}
	}
}
