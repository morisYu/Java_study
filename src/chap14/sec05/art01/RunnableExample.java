package chap14.sec05.art01;

public class RunnableExample {
	public static void main(String[] args) {
		
		// �������� �۾��� �����ϴ� Runnable �������̽��� �Ű������� ���ϰ��� ����
		// run() �޼ҵ常 �����ϱ� ������ ���ٽ��� �̿��ؼ� Runnable �������̽��� ���� ����
		Runnable runnable = () -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		// Thread �����ڸ� ȣ���� �� ���ٽ��� �Ű������� �����ص� ��
		Thread thread2 = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		});
		thread2.start();
	}
}
