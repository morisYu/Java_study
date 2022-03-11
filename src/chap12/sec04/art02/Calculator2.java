package chap12.sec04.art02;

public class Calculator2 {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 임계 영역을 지정하기 위해 동기화(synchronized) 메소드를 만들어줌
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public void print() {
		System.out.println(Thread.currentThread().getName()+" 일반메소드 실행");
	}
}
