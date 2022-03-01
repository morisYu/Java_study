package chap06.exercise;

import java.util.Scanner;

public class Chap06Ex15_MemberServiceExample {
	public static void main(String[] args) {
		Chap06Ex15_MemberService memberservice = new Chap06Ex15_MemberService();

		int count = 0;
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id입력> ");
			String id = scanner.next();
			System.out.print("password입력> ");
			String password = scanner.next();

			boolean result = memberservice.login(id, password);
			if (result) {
				System.out.println("로그인 되었습니다.");
				memberservice.logout("hong");
				break;
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				count++;
				if (count >= 3) {
					System.out.println("비밀번호를 3 번 틀렸습니다.");
					break;
				}
			}
		}
		System.out.println("Program OFF");
	}
}
