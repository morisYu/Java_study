package chap07.exercise;

public class Chap07Ex06_Child extends Chap07Ex06_Parent {
	@SuppressWarnings("unused")
	private String name;

	public Chap07Ex06_Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}

	public Chap07Ex06_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
