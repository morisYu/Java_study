package chap15.sec06.art02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Queue 인터페이스는 FIFO(First In First Out) 자료구조에서 사용되는 메소드를 정의하고 있다.
public class QueueExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brStr = br.readLine();
		String[] input = brStr.split("@");
		String command = input[0];
		String to = input[1];

		Queue<Message> messageQueue = new LinkedList<Message>();

		// 큐에 메시지 저장
		messageQueue.offer(new Message(command, to));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		System.out.println("peek() 메소드는 객체를 큐에서 제거하지 않음");
		System.out.println("---------------------------------");
		for (int i = 0; i < messageQueue.size(); i++) {
			Message message = messageQueue.peek();
			switch (message.command) {
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 kakaotalk을 보냅니다.");
				break;
			default:
				System.out.println(message.to + "님에게 " + message.command + "를 보냅니다.");
				break;
			}
			System.out.println("남은 메세지 수: " + messageQueue.size());
		}
		System.out.println();
		System.out.println("poll() 메소드는 객체를 큐에서 제거");
		System.out.println("---------------------------------");
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 kakaotalk을 보냅니다.");
				break;
			default:
				System.out.println(message.to + "님에게 " + message.command + "를 보냅니다.");
				break;
			}
			System.out.println("남은 메세지 수: " + messageQueue.size());
		}
	}
}
