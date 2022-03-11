package chap12.sec02.art03;

// 스레드 이름 설정 안함
public class ThreadB extends Thread {

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
