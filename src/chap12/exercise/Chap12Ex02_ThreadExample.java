package chap12.exercise;

public class Chap12Ex02_ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new Chap12Ex02_MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new Chap12Ex02_MusicRunnable());
		thread2.start();
	}
}
