package chap12.sec06.art05;

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				// interrupt 메소드를 실행하면 sleep 메소드로 일시 정지 상태일 때
				// InterruptedException이 발생하여 예외처리가 되면서 while 문을 빠져나옴
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {

		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
