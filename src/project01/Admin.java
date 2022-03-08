package project01;

public class Admin {
	private static String adminId = "admin";
	private static String adminPass = "12345";

	private static Admin admin = new Admin();

	private Admin() {

	}

	static Admin getInstance() {
		return admin;
	}

	void changeIdPassword(String adminId, String adminPass) {
		Admin.adminId = adminId;
		Admin.adminPass = adminPass;
		System.out.println("변경 아이디: " + Admin.adminId);
		System.out.println("변경 비밀번호: " + Admin.adminPass);
	}

	static char adminCheck(String adminId, String adminPass) {
		if (Admin.adminId.equals(adminId)) {
			if (Admin.adminPass.equals(adminPass)) {
				System.out.println("관리자 아이디로 로그인 하셨습니다.");
				return 'o';
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
				return 'p';
			}
		}
		System.out.println("아이디가 틀렸습니다.");
		return 'x';
	}
}
