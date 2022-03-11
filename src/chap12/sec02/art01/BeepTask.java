package chap12.sec02.art01;

import java.awt.Toolkit;

// Runnable �������̽��� ����
// �� ������ü�� �Ű������� Thread �����ڸ� ȣ���ؾ� �۾������尡 ������
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
