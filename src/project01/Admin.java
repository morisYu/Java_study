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
		System.out.println("���� ���̵�: " + Admin.adminId);
		System.out.println("���� ��й�ȣ: " + Admin.adminPass);
	}

	static char adminCheck(String adminId, String adminPass) {
		if (Admin.adminId.equals(adminId)) {
			if (Admin.adminPass.equals(adminPass)) {
				System.out.println("������ ���̵�� �α��� �ϼ̽��ϴ�.");
				return 'o';
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				return 'p';
			}
		}
		System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		return 'x';
	}
}
