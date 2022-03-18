package chap12.exercise;

public class Chap12Ex10_ThreadExample {
	public static void main(String[] args) {
		Thread thread = new Chap12Ex10_MovieThread();
		thread.setDaemon(true);
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");
	}
}
