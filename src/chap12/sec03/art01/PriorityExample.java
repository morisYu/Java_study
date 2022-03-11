package chap12.sec03.art01;

// �������� �۾� �켱����
// MAX_PRIORITY�� ���� 10�� ���� ����, MIN_PRIORITY�� 1�� ���� ���߿� �۾��Ѵ�
public class PriorityExample {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i==5) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}else if(i>=1&&i<=3) {
				thread.setPriority(8-i);
			}
			else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}
	}
}
