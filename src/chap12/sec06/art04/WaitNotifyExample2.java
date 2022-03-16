package chap12.sec06.art04;

public class WaitNotifyExample2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsummerThread consummerThread = new ConsummerThread(dataBox);
		
		consummerThread.start();
		producerThread.start();
	}
}
