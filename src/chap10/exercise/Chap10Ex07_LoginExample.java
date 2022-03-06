package chap10.exercise;

public class Chap10Ex07_LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}

	public static void login(String id, String password)
			throws Chap10Ex07_WrongPasswordException, Chap10Ex07_NotExistIDExeption {

		// id 가 "blue" 가 아니라면 Chap10Ex07_NotExistIDExeption 발생시킴
		if (!id.equals("blue")) {
			throw new Chap10Ex07_NotExistIDExeption("아이디가 없습니다.");
		}

		// password가 "12345" 가 아니라면 Chap10Ex07_WrongPasswordException 발생시킴
		if (!password.equals("12345")) {
			throw new Chap10Ex07_WrongPasswordException("비밀번호가 틀렸습니다.");
		}
	}
}
