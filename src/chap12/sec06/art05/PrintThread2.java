package chap12.sec06.art05;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("���� ��");
				// interrupt �޼ҵ带 �����ϸ� sleep �޼ҵ�� �Ͻ� ���� ������ ��
				// InterruptedException�� �߻��Ͽ� ����ó���� �Ǹ鼭 while ���� ��������
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {

		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
