package chap12.sec06.art05;

public class PrintThread3 extends Thread{
	public void run() {
		while(true) {
			System.out.println("���� ��");
			
			// Interrupt�� ȣ��Ǿ����� Ȯ���ؼ� �ݺ����� ��������
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
