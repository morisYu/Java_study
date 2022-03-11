package chap12.sec02.art01;

import java.awt.Toolkit;

// �������� �︮�� �Ͱ� ����Ʈ �ϴ� ���� �ٸ� �۾��̱� ������ ���� �����尡 ���ÿ� �� �۾��� ������� ����
public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// �������� ���� �߻� ��
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
		// ����Ʈ �۾� ����
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
