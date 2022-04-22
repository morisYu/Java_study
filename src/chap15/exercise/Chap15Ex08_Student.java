package chap15.exercise;

public class Chap15Ex08_Student {
	public int studentNum;
	public String name;

	public Chap15Ex08_Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Chap15Ex08_Student) {
			Chap15Ex08_Student student = (Chap15Ex08_Student) obj;
			return student.studentNum == studentNum;
		}
			return false;
	}
}
