package chap15.exercise;

public class Chap15Ex10_Student implements Comparable<Chap15Ex10_Student> {
	public String id;
	public int score;
	
	public Chap15Ex10_Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Chap15Ex10_Student o) {
		if(score>o.score) {
			return 1;
		}else if(score == o.score) {
			return 0;
		}else {
			return -1;
		}
	}
}
