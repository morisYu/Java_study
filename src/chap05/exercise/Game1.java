package chap05.exercise;

/*
 * 가위, 바위, 보 게임 만들기
 * 숫자를 입력받아서 컴퓨터와 가위바위보 진행
 * 1대1로 가위바위보 진행, 2대1로 가위바위보 진행
 */
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] result = new String[] { "가위", "바위", "보" };

		while (true) {
			int user = 0;
			int com1 = 0;
			int com2 = 0;

			System.out.println("자.. 게임을 시작하지");
			System.out.print("플레이어 수를 입력하시오 >");
			user = scanner.nextInt();
			if (user == 1) {
				System.out.println("컴퓨터와 1대1 승부를 원하는군");
				System.out.println();
				while (true) {
					System.out.println("1: 가위 / 2: 바위 / 3: 보");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					if (user == com1) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("무승부");
						break;
					} else if (user > com1 || (user == 0 && com1 == 2)) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("이겼군");
						break;
					} else {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("Looser");
						break;
					}
				}

			} else if (user == 2) {
				System.out.println("두 컴퓨터를 상대하기는 힘들텐데");
				System.out.println();
				while (true) {
					System.out.println("1: 가위 / 2: 바위 / 3: 보");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					com2 = (int) (Math.random() * 3);
					if ((user == com1 && user == com2) || (user != com1 && user != com2 && com1 != com2)) {
						System.out.println(
								"user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > " + result[com2]);
						System.out.println("무승부");
						break;
					}

					// user 승리
					if (user == 0) {
						if (com1 == 2 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user 승리!!");
						} else if (com1 == 0 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else if (com1 == 2 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (user == 1) {
						if (com1 == 0 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user 승리!!");
						} else if (com1 == 1 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else if (com1 == 0 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (user == 2) {
						if (com1 == 1 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user 승리!!");
						} else if (com1 == 2 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else if (com1 == 1 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					// com1 승리
					if (com1 == 0) {
						if (com2 == 2 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1 승리!!");
						} else if (com2 == 0 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com2 == 2 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (com1 == 1) {
						if (com2 == 0 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1 승리!!");
						} else if (com2 == 1 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com2 == 0 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (com1 == 2) {
						if (com2 == 1 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1 승리!!");
						} else if (com2 == 2 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com2 == 1 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					// com2 승리
					if (com2 == 0) {
						if (com1 == 2 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2 승리!!");
						} else if (com1 == 0 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com1 == 2 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (com2 == 1) {
						if (com1 == 0 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2 승리!!");
						} else if (com1 == 1 && user == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com1 == 0 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
					if (com2 == 2) {
						if (com1 == 1 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2 승리!!");
						} else if (com1 == 2 && user == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/com2 승리!!");
						} else if (com1 == 1 && user == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user 승리!!");
						} else {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
						}
						break;
					}
				}

			} else if (user == 0) {
				System.out.println("잘가게");
				break;
			} else {
				System.out.println("0 : 그만하기 / 1 : 1대1 / 2 : 2대1");
				continue;
			}
			System.out.println();
		}
		System.out.println("Program OFF");
	}
}
