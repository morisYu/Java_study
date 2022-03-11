package chap12.sec02.art03;

// 스레드의 이름 설정 가능(설정 안하면 0부터 숫자가 붙음)
public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
