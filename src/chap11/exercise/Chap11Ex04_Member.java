package chap11.exercise;

public class Chap11Ex04_Member {
	private String id;
	private String name;

	public Chap11Ex04_Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		String result = id + ": " + name;
		return result;
	}
}
