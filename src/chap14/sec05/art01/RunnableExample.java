package chap14.sec05.art01;

public class RunnableExample {
	public static void main(String[] args) {
		
		// 스레드의 작업을 정의하는 Runnable 인터페이스는 매개변수와 리턴값이 없는
		// run() 메소드만 존재하기 때문에 람다식을 이용해서 Runnable 인터페이스를 생성 가능
		Runnable runnable = () -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		// Thread 생성자를 호출할 때 람다식을 매개값으로 대입해도 됨
		Thread thread2 = new Thread(() -> {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		});
		thread2.start();
	}
}
