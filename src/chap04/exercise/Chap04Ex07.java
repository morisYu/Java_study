package chap04.exercise;

import java.util.Scanner;

public class Chap04Ex07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");

			int num = scanner.nextInt();

			switch (num) {
			case 1:
				System.out.print("���ݾ�> ");
				balance += scanner.nextInt();
				break;

			case 2:
				System.out.print("��ݾ�> ");
				balance -= scanner.nextInt();
				break;

			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
			case 4:
				run = false;
			}
		}
		System.out.println("Program OFF");
	}
}
