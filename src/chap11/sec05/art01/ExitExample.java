package chap11.sec05.art01;

public class ExitExample {
	public static void main(String[] args) {
		// 보안관리자 설정
		// System.exit() 메소드 실행 시 항상 checkExit() 메소드가 호출됨
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i = 0; i < 10; i++) {
			// i 값 출력
			System.out.println(i);
			try {
				// JVM 종료 요청
				System.exit(i);
			} catch (SecurityException e) {

			}
		}
	}
}
