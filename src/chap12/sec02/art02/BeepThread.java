package chap12.sec02.art02;

import java.awt.Toolkit;

// Runnable �� ������ü�� �ƴ� Thread�� ���� Ŭ������ �۾� ������ ����
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.print("��");
			try {
				Thread.sleep(500);

			} catch (Exception e) {

			}
		}
	}
}
