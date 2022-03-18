package chap12.exercise;

public class Chap12Ex08_MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			if (Thread.interrupted()) {
				System.out.println("interrupted() 메소드 호출");
				break;
			}
		}
	}

}
