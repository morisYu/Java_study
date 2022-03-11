package chap12.sec04.art02;

public class Calculator2 {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// �Ӱ� ������ �����ϱ� ���� ����ȭ(synchronized) �޼ҵ带 �������
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public void print() {
		System.out.println(Thread.currentThread().getName()+" �Ϲݸ޼ҵ� ����");
	}
}
