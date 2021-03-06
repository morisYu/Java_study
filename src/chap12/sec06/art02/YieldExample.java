package chap12.sec06.art02;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// ThreadA, ThreadB 모두 실행
		threadA.start();
		threadB.start();
		
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		// ThreadB 만 실행
		threadA.work = false;
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		// ThreadA, ThreadB 모두 실행
		threadA.work = true;
		
		try {Thread.sleep(2000);
		
		}catch(InterruptedException e) {
			
		}
		
		// ThreadA, ThreadB 모두 종료
		threadA.stop = true;
		threadB.stop = true;
	}
}
