package chap06.exercise;

import java.util.Scanner;

public class Chap06Ex15_MemberServiceExample {
	public static void main(String[] args) {
		Chap06Ex15_MemberService memberservice = new Chap06Ex15_MemberService();

		int count = 0;
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.print("id�Է�> ");
			String id = scanner.next();
			System.out.print("password�Է�> ");
			String password = scanner.next();

			boolean result = memberservice.login(id, password);
			if (result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				memberservice.logout("hong");
				break;
			} else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
				count++;
				if (count >= 3) {
					System.out.println("��й�ȣ�� 3 �� Ʋ�Ƚ��ϴ�.");
					break;
				}
			}
		}
		System.out.println("Program OFF");
	}
}
