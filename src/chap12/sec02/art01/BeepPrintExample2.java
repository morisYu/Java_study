package chap12.sec02.art01;

// �� �۾��� ����ϴ� �����尡 �ٸ��� ������ ������ ��°� ����Ʈ �۾��� ���ÿ� ����� �� ����
public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		// �۾������忡�� ����ϴ� �۾�
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		// ���ν����忡�� ����ϴ� �۾�
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
