package chap15.sec06.art02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Queue �������̽��� FIFO(First In First Out) �ڷᱸ������ ���Ǵ� �޼ҵ带 �����ϰ� �ִ�.
public class QueueExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String brStr = br.readLine();
		String[] input = brStr.split("@");
		String command = input[0];
		String to = input[1];

		Queue<Message> messageQueue = new LinkedList<Message>();

		// ť�� �޽��� ����
		messageQueue.offer(new Message(command, to));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKakaotalk", "ȫ�β�"));

		System.out.println("peek() �޼ҵ�� ��ü�� ť���� �������� ����");
		System.out.println("---------------------------------");
		for (int i = 0; i < messageQueue.size(); i++) {
			Message message = messageQueue.peek();
			switch (message.command) {
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� kakaotalk�� �����ϴ�.");
				break;
			default:
				System.out.println(message.to + "�Կ��� " + message.command + "�� �����ϴ�.");
				break;
			}
			System.out.println("���� �޼��� ��: " + messageQueue.size());
		}
		System.out.println();
		System.out.println("poll() �޼ҵ�� ��ü�� ť���� ����");
		System.out.println("---------------------------------");
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� kakaotalk�� �����ϴ�.");
				break;
			default:
				System.out.println(message.to + "�Կ��� " + message.command + "�� �����ϴ�.");
				break;
			}
			System.out.println("���� �޼��� ��: " + messageQueue.size());
		}
	}
}
