package chap06.exercise;

public class Chap06Ex13 {
	String name;
	String id;
	String password;
	int age;

	Chap06Ex13() {
		System.out.println("생성자(이름,아이디) 를 입력하세요");
	}
	
	Chap06Ex13(String name) {
		this(name, null, null, 0);
	}

	Chap06Ex13(String name, String id) {
		this(name, id, null, 0);
	}

	Chap06Ex13(String name, String id, String password) {
		this(name, id, password, 0);
	}

	Chap06Ex13(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
