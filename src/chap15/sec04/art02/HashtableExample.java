package chap15.sec04.art02;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		// Hashtable 은 HashMap과 동일한 내부구조를 가지고 있다.
		// Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티스레드가 동시에
		// 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드를
		// 실행할 수 있다. 따라서 멀티스레드 환경에서 안전하게 객체를 추가, 삭제 가능
		Map<String, String> map = new Hashtable<String, String>();

		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			String id = scanner.nextLine();

			System.out.print("비밀번호: ");
			String password = scanner.nextLine();

			// 아이디가 존재하는지 확인
			if (map.containsKey(id)) {
				// 입력한 비밀번호를 미리 저장된 비밀번호와 비교
				if (map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
