package chap12.sec06.art02;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}