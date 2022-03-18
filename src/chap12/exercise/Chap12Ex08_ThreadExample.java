package chap12.exercise;

public class Chap12Ex08_ThreadExample {
	public static void main(String[] args) {
		Thread thread = new Chap12Ex08_MovieThread();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		thread.interrupt();
	}
}
