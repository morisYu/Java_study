package chap09.exercise;

import java.util.Scanner;

public class Chap09Ex06_Chatting {
	public static void main(String[] args) {
		Chap09Ex06_Chatting chatting = new Chap09Ex06_Chatting();

		chatting.startChat("moris");

	}

	void startChat(String chatId) {
		// 로컬 클래스가 메소드의 매개 변수나 로컬 변수를 사용할 경우 사용되는 매개 변수와 로컬 변수는 final 의 특성을 가진다.
		// 마찬가지로 익명 객체도 메소드의 매개 변수나 로컬 변수를 사용할 때는 final 의 특성을 가진다.
		// 따라서 익명 객체에서 사용되는 매개변수는 최초 한 번만 설정할 수 있다.
//		String nickName = null;
//		nickName = chatId;

		String nickName = chatId;

		String outputData = null;
		outputData = "잘가세요";
		String end = "bye";

		Chat chat = new Chat() {
			@Override
			public void start() {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				while (true) {
					String inputData = scanner.next();
					if(inputData.equals(end)) {
						break;
					}
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
		System.out.println(outputData);
	}

	class Chat {
		void start() {

		}

		void sendMessage(String message) {
			System.out.println(message);
		}
	}
}
