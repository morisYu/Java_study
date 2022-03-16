package chap12.sec06.art05;

public class PrintThread3 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행 중");
			
			// Interrupt가 호출되었는지 확인해서 반복문을 빠져나옴
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
