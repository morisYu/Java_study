package chap12.sec06.art05;

public class InterruptExample {
	public static void main(String[] args) {
		System.out.println("인터럽트 발생시켜 예외처리로 반복문 종료");
		Thread thread = new PrintThread2();

		thread.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		thread.interrupt();

		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
		}
		
		System.out.println("\n인터럽트 호출여부 확인 후 반복문 종료");
		Thread thread2 = new PrintThread3();
		
		thread2.start();

		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {

		}
		thread2.interrupt();
	}
}
