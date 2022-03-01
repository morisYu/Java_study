package chap06.exercise;

import java.util.Scanner;

public class Chap06Ex20_BankApplication {
	private static Chap06Ex20_Account[] accountArray = new Chap06Ex20_Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// 객체를 배열로 생성헀을 때 각 객체마다 초기화 필요함.
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Chap06Ex20_Account("none", "none", 0);
		}

		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");

			try {
				selectNo = scanner.nextInt();
			} catch (Exception e) {
				scanner = new Scanner(System.in);
				continue;
			}

			switch (selectNo) {
			case 1:
				System.out.println("-------");
				System.out.println("계좌 생성");
				System.out.println("-------");
				createAccount();
				break;
			case 2:
				System.out.println("-------");
				System.out.println("계좌 목록");
				System.out.println("-------");
				accountList();
				break;
			case 3:
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				deposit();
				break;
			case 4:
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				withdraw();
				break;
			case 5:
				System.out.println("-------");
				System.out.println("종료");
				System.out.println("-------");
				run = false;
				break;
			default:
				System.out.println("다시 선택");
				System.out.println("=======");
				break;
			}
		}
		System.out.println("Program OFF");
	}

	// 계좌 생성하기
	private static void createAccount() {
		int tmp = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == "none") {
				tmp = i;
				break;
			}
		}
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		accountArray[tmp].setAno(ano);
		accountArray[tmp].setOwner(owner);
		accountArray[tmp].setBalance(balance);

	}

	// 계좌 목록보기
	private static void accountList() {
		int tmp = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == "none") {
				tmp = i;
				break;
			}
		}
		System.out.println(" 계좌번호   " + "  계좌주   " + "예금액");
		for (int i = 0; i < tmp; i++) {
			System.out.print(accountArray[i].getAno() + "   " + accountArray[i].getOwner() + "   "
					+ accountArray[i].getBalance() + "\n");
		}
	}

	// 예금하기
	private static void deposit() {
		while (true) {
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			int balance = Math.abs(money);

			for (int i = 0; i < accountArray.length; i++) {
				if (ano.equals(accountArray[i].getAno())) {
					accountArray[i].setBalance(balance);
					System.out.println("잔액: " + accountArray[i].getBalance());
					return;
				}
			}
			System.out.println("계좌번호를 다시 입력하세요");
			continue;
		}
	}

	// 출금하기
	private static void withdraw() {
		while (true) {
			System.out.print("계좌번호: ");
			String ano = scanner.next();
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			int balance = -(Math.abs(money));

			for (int i = 0; i < accountArray.length; i++) {
				if (ano.equals(accountArray[i].getAno())) {
					accountArray[i].setBalance(balance);
					System.out.println("잔액: " + accountArray[i].getBalance());
					return;
				}
			}
			System.out.println("계좌번호를 다시 입력하세요");
			continue;
		}
	}
}
