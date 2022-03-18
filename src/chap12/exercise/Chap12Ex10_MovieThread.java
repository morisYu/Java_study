package chap12.exercise;

public class Chap12Ex10_MovieThread extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
