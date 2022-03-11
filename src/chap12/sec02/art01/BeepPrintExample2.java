package chap12.sec02.art01;

// 각 작업을 담당하는 스레드가 다르기 때문에 비프음 출력과 프린트 작업이 동시에 진행될 수 있음
public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		// 작업스레드에서 담당하는 작업
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		// 메인스레드에서 담당하는 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
