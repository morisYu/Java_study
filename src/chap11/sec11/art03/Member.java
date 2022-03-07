package chap11.sec11.art03;

public class Member implements Comparable<Member> {
	String name;
	int score;

	Member(int score, String name) {
		this.score = score;
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
