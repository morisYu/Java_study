package chap12.sec06.art05;

public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	// ������� run �޼ҵ尡 ������ �ڵ����� ����Ǳ� ������ run �޼ҵ尡 ����������
	// ���ᰡ �ǵ��� �����ؾ� ��.
	public void run() {
		while (!stop) {
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
