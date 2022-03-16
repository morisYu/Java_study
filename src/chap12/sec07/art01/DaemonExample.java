package chap12.sec07.art01;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();

		// 데몬 스레드는 주 스레드의 작업을 보조하는 역할을 수행
		// 따라서 주 스레드가 종료되면 데몬 스레드는 강제 종료됨
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("메인 스레드 종료");
	}
}
