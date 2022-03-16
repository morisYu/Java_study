package chap12.sec06.art05;

public class PrintThread1 extends Thread {
	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	// 스레드는 run 메소드가 끝나면 자동으로 종료되기 때문에 run 메소드가 정상적으로
	// 종료가 되도록 유도해야 함.
	public void run() {
		while (!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
