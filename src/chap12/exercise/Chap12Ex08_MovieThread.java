package chap12.exercise;

public class Chap12Ex08_MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			if (Thread.interrupted()) {
				System.out.println("interrupted() �޼ҵ� ȣ��");
				break;
			}
		}
	}

}
