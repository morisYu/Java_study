package chap12.sec02.art03;

// �������� �̸� ���� ����(���� ���ϸ� 0���� ���ڰ� ����)
public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
