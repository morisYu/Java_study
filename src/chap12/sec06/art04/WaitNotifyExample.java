package chap12.sec06.art04;

public class WaitNotifyExample {
	public static void main(String[] args) {
		// ������ü ����
		WorkObject sharedObject = new WorkObject();

		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);

		threadA.start();
		threadB.start();
	}
}
