package chap12.sec07.art01;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();

		// ���� ������� �� �������� �۾��� �����ϴ� ������ ����
		// ���� �� �����尡 ����Ǹ� ���� ������� ���� �����
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		System.out.println("���� ������ ����");
	}
}
