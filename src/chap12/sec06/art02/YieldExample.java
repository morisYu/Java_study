package chap12.sec06.art02;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// ThreadA, ThreadB ��� ����
		threadA.start();
		threadB.start();
		
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		// ThreadB �� ����
		threadA.work = false;
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		// ThreadA, ThreadB ��� ����
		threadA.work = true;
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		
		// ThreadA, ThreadB ��� ����
		threadA.stop = true;
		threadB.stop = true;
	}
}
