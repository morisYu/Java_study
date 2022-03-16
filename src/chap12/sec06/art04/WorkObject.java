package chap12.sec06.art04;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA �۾� ����");
		
		// �Ͻ� ���� ���¿� �ִ� ThreadB�� ���� ��� ���·� ����
		notify();
		try {
			// ThreadA�� �Ͻ� ���� ���·� ����
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB �۾� ����");
		
		//�Ͻ� ���� ���¿� �ִ� ThreadA�� ���� ��� ���·� ����
		notify();
		try {
			// ThreadB�� �Ͻ� ���� ���·� ����
			wait();
		}catch(InterruptedException e) {
			
		}
	}
}
